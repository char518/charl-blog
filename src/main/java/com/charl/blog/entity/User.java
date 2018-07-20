package com.charl.blog.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @program: blog
 * @description:
 * @author: charl
 * @create: 2018-07-20 09:55
 **/
@Data
@Entity
@Table(name = "bl_user")
public class User extends BaseDomin implements Serializable {

    /**
     * 用户名
     */
    @Column(name = "name")
    private String name;

    /**
     * 密码
     */
    @Column(name = "password")
    private String password;

    /**
     * 手机号
     */
    @Column(name = "mobile")
    private String mobile;

    /**
     * 头像
     */
    @Column(name = "image")
    private String image = "";

    /**
     * 别名
     */
    @Column(name = "alias")
    private String alias = "";

    /**
     * 邮箱
     */
    @Column(name = "email")
    private String email = "";

    /**
     * 个人描述
     */
    @Column(name = "description")
    private String description = "";

    /**
     * 状态
     */
    @Column(name = "status")
    private Integer status = 0;

}
