package com.charl.blog.dao;

import com.charl.blog.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @program: blog
 * @description:
 * @author: charl
 * @create: 2018-07-20 17:36
 **/
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
