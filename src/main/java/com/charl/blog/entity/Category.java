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
 * @create: 2018-07-20 17:20
 **/
@Data
@Entity
@Table(name = "bl_category")
public class Category extends BaseDomin implements Serializable {

    @Column(name = "name")
    private String name;

    @Column(name = "parent_id")
    private Integer parentId;

}
