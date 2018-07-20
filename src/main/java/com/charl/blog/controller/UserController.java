package com.charl.blog.controller;

import com.charl.blog.common.vo.BasePageVo;
import com.charl.blog.common.vo.ResponseVo;
import com.charl.blog.service.IUserService;
import com.charl.blog.vo.request.RegisterUserVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: blog
 * @description:
 * @author: charl
 * @create: 2018-07-20 14:21
 **/
@Api(value = "【博客用户API】",description = "【博客用户系统接口】")
@RequestMapping(value = "/user")
@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping(value = "/registerUser")
    @ApiOperation(value = "注册用户接口")
    public ResponseVo registerUser(@RequestBody RegisterUserVo vo) {
        return userService.registerUser(vo);
    }

    @PostMapping(value = "/queryUser")
    @ApiOperation(value = "查询用户接口")
    public ResponseVo queryUser(BasePageVo vo) {
        return userService.queryUser(vo);
    }


}
