package com.charl.blog.service;

import com.charl.blog.common.vo.ResponseVo;
import com.charl.blog.vo.request.RegisterUserVo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @program: blog
 * @description:
 * @author: charl
 * @create: 2018-07-20 14:51
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private IUserService userService;

    @Test
    public void registerUserTest() {
        RegisterUserVo userVo = new RegisterUserVo();

        userVo.setName("charl");
        userVo.setAlias("酷酷的海");
        userVo.setEmail("char360@hotmail.com");
        userVo.setMobile("15220212336");
        userVo.setPassword("123456");
        ResponseVo responseVo = userService.registerUser(userVo);

        Assert.assertNotNull(responseVo);
    }

}
