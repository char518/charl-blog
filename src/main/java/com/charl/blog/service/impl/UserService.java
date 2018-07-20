package com.charl.blog.service.impl;

import com.charl.blog.common.GlobalConstant;
import com.charl.blog.common.util.BeanUtil;
import com.charl.blog.common.vo.BasePageVo;
import com.charl.blog.common.vo.ResponseVo;
import com.charl.blog.dao.UserRepository;
import com.charl.blog.entity.User;
import com.charl.blog.service.IUserService;
import com.charl.blog.vo.request.RegisterUserVo;
import com.charl.blog.vo.response.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: blog
 * @description:
 * @author: charl
 * @create: 2018-07-20 10:48
 **/
@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public ResponseVo registerUser(RegisterUserVo registerUserVo) {
        ResponseVo responseVo = new ResponseVo();
        User user = userRepository.findByNameOrMobileAndDelFlag(registerUserVo.getName(),
                registerUserVo.getMobile(), GlobalConstant.DEL_FLAG_OFF);
        if (null != user) {
            responseVo.buildFailedInstance("用户已存在,请登录！！！");
        }
        User copy = BeanUtil.copy(registerUserVo, User.class);
        copy.setDelFlag(GlobalConstant.DEL_FLAG_OFF);

        User save = userRepository.save(copy);
        return responseVo.buildSuccessInstance(save);
    }

    @Override
    public ResponseVo queryUser(BasePageVo basePageVo) {
        Page<User> pageList = userRepository.findAll(PageRequest.of(basePageVo.getPageNo() - 1,
                basePageVo.getPageSize()));
        List<User> content = pageList.getContent();
        return ResponseVo.buildSuccessInstance(BeanUtil.copyList(content, UserVo.class));
    }
}
