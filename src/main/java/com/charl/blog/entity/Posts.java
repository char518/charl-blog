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
 * @create: 2018-07-20 17:25
 **/
@Data
@Entity
@Table(name = "bl_post")
public class Posts extends BaseDomin implements Serializable {

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;

    @Column(name = "author_id")
    private Integer authorId;

    @Column(name = "category_id")
    private Integer categoryId;

    @Column(name = "visits")
    private Integer visits;

}
