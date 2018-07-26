package com.charl.blog.service.impl;

import com.charl.blog.common.util.BeanUtil;
import com.charl.blog.common.vo.BasePageRespVo;
import com.charl.blog.dao.PostsRepository;
import com.charl.blog.entity.Posts;
import com.charl.blog.service.IPostService;
import com.charl.blog.vo.request.AddPostVo;
import com.charl.blog.vo.request.QueryPostsVo;
import com.charl.blog.vo.request.UpdatePostVo;
import com.charl.blog.vo.response.PostVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.Date;
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
    public BasePageRespVo<PostVo> queryList(QueryPostsVo vo) {
        Pageable pageable = PageRequest.of(vo.getPageNo() - 1, vo.getPageSize(), Sort.Direction.DESC, "addTime");

        //构建查询条件
        Specification<Posts> specification = new Specification<Posts>() {
            @Override
            public Predicate toPredicate(Root<Posts> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
                List<Predicate> list = new ArrayList<Predicate>();
                if (!StringUtils.isEmpty(vo.getTitle())) {
                    list.add(criteriaBuilder.like(root.get("title").as(String.class),"%"+ vo.getTitle() + "%"));
                }
                if (null != vo.getAddTime()) {
                    list.add(criteriaBuilder.equal(root.get("addTime").as(Date.class), vo.getAddTime()));
                }
                Predicate[] p = new Predicate[list.size()];
                return criteriaBuilder.and(list.toArray(p));
            }
        };

        Page<Posts> all = postsRepository.findAll(specification, pageable);

        List<PostVo> postVos = BeanUtil.copyList(all.getContent(), PostVo.class);
        return BasePageRespVo.buildBaseResp(postVos, (int) all.getTotalElements());
    }
}
