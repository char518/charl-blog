package com.charl.blog.controller;

import com.charl.blog.common.vo.BasePageRespVo;
import com.charl.blog.common.vo.ResponseVo;
import com.charl.blog.service.IPostService;
import com.charl.blog.vo.request.AddPostVo;
import com.charl.blog.vo.request.QueryPostsVo;
import com.charl.blog.vo.request.UpdatePostVo;
import com.charl.blog.vo.response.PostVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: blog
 * @description:
 * @author: charl
 * @create: 2018-07-26 14:09
 **/
@Api(value = "【博客帖子API】",description = "【博客帖子系统接口】")
@RequestMapping(value = "/post")
@RestController
public class PostController {

    @Autowired
    private IPostService postService;

    @PostMapping(value = "/addPost")
    @ApiOperation(value = "添加帖子")
    public ResponseVo addPost(@RequestBody AddPostVo vo) {
        return ResponseVo.buildSuccessInstance(postService.addPost(vo));
    }

    @PostMapping(value = "/searchPost")
    @ApiOperation(value = "添加帖子")
    public ResponseVo searchPost(@RequestBody QueryPostsVo vo) {
        BasePageRespVo<PostVo> respVo = postService.queryList(vo);
        return ResponseVo.buildSuccessInstance(respVo);
    }

    @PostMapping(value = "/updatePost")
    @ApiOperation(value = "修改帖子")
    public ResponseVo searchPost(@RequestBody UpdatePostVo vo) {
        int i = postService.updatePost(vo);
        return ResponseVo.buildSuccessInstance(i);
    }

}
