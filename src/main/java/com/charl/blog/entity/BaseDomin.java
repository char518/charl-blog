package com.charl.blog.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * @program: blog
 * @description:
 * @author: charl
 * @create: 2018-07-20 17:20
 **/
@Data
public class BaseDomin implements Serializable {

    /**
     * 主键id
     */
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

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
