package com.charl.blog.service;

import com.charl.blog.common.vo.BasePageRespVo;
import com.charl.blog.vo.request.AddPostVo;
import com.charl.blog.vo.request.QueryPostsVo;
import com.charl.blog.vo.request.UpdatePostVo;
import com.charl.blog.vo.response.PostVo;

/**
 * @program: blog
 * @description:
 * @author: charl
 * @create: 2018-07-23 17:45
 **/
public interface IPostService {

    int addPost(AddPostVo vo);

    int updatePost(UpdatePostVo vo);

    BasePageRespVo<PostVo> queryList(QueryPostsVo vo);


}
