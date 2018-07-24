package com.charl.blog.service.impl;

import com.charl.blog.common.util.BeanUtil;
import com.charl.blog.dao.PostsRepository;
import com.charl.blog.entity.Posts;
import com.charl.blog.service.IPostService;
import com.charl.blog.vo.request.AddPostVo;
import com.charl.blog.vo.request.QueryPostsVo;
import com.charl.blog.vo.request.UpdatePostVo;
import com.charl.blog.vo.response.PostVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: blog
 * @description:
 * @author: charl
 * @create: 2018-07-23 17:46
 **/
@Service
public class PostService implements IPostService {

    @Autowired
    private PostsRepository postsRepository;

    @Override
    public int addPost(AddPostVo vo) {
        Posts add = BeanUtil.copy(vo, Posts.class);
        Posts save = postsRepository.save(add);
        if (null == save) {
            return 0;
        }
        return save.getId();
    }

    @Override
    public int updatePost(UpdatePostVo vo) {
        Posts add = BeanUtil.copy(vo, Posts.class);
        Posts save = postsRepository.save(add);
        return save.getId();
    }

    @Override
    public List<PostVo> queryList(QueryPostsVo vo) {

        ExampleMatcher matcher = ExampleMatcher.matching().withMatcher("title", match -> match.endsWith()).withMatcher("author", match -> match.startsWith());

        Example<QueryPostsVo> of = Example.of(vo, matcher);

        List<Posts> all = postsRepository.findAll();

        List<PostVo> postVos = BeanUtil.copyList(all, PostVo.class);
        return postVos;
    }
}
