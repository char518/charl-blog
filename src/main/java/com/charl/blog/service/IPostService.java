package com.charl.blog.service;

import com.charl.blog.vo.request.AddPostVo;
import com.charl.blog.vo.request.QueryPostsVo;
import com.charl.blog.vo.request.UpdatePostVo;
import com.charl.blog.vo.response.PostVo;

import java.util.List;

/**
 * @program: blog
 * @description:
 * @author: charl
 * @create: 2018-07-23 17:45
 **/
public interface IPostService {

    int addPost(AddPostVo vo);

    int updatePost(UpdatePostVo vo);

    List<PostVo> queryList(QueryPostsVo vo);


}
