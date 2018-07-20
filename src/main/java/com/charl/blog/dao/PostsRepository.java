package com.charl.blog.dao;

import com.charl.blog.entity.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @program: blog
 * @description:
 * @author: charl
 * @create: 2018-07-20 17:37
 **/
public interface PostsRepository extends JpaRepository<Posts, Integer> {
}
