package com.charl.blog.service;

import com.charl.blog.common.vo.BasePageVo;
import com.charl.blog.common.vo.ResponseVo;
import com.charl.blog.vo.request.RegisterUserVo;

/**
 * @program: blog
 * @description:
 * @author: charl
 * @create: 2018-07-20 10:06
 **/
public interface IUserService {

    ResponseVo registerUser(RegisterUserVo registerUserVo);

    ResponseVo queryUser(BasePageVo basePageVo);
}
