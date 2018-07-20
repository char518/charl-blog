package com.charl.blog.dao;

import com.charl.blog.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @program: blog
 * @description:
 * @author: charl
 * @create: 2018-07-20 10:08
 **/
public interface UserRepository extends JpaRepository<User, Integer> {

    User findByMobile(String mobile);

    User findByMobileAndPassword(String mobile, String password);

    User findByNameOrMobileAndDelFlag(String name, String mobile, int delFalg);
}
