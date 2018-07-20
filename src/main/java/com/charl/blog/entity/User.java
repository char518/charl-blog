package com.charl.blog.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @program: blog
 * @description:
 * @author: charl
 * @create: 2018-07-20 09:55
 **/
@Data
@Entity
@Table(name = "bl_user")
public class User implements Serializable {

    /**
     * 主键id
     */
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

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

    /**
     * 删除标志：0.未删除 1.已删除
     */
    @Column(name = "del_flag")
    private Integer delFlag = 0;

    /**
     * 添加时间
     */
    @Column(name = "add_time")
    private Date addTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;


}
