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
 * @create: 2018-07-20 17:29
 **/
@Data
@Entity
@Table(name = "bl_comments")
public class Comments extends BaseDomin implements Serializable {

    @Column(name = "post_id")
    private Integer postId;

    @Column(name = "author_id")
    private Integer authorId;

    @Column(name = "content")
    private String content;

    @Column(name = "parent_id")
    private Integer parentId;

}
