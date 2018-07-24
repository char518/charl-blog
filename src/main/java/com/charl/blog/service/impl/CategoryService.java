package com.charl.blog.service.impl;

import com.charl.blog.dao.CategoryRepository;
import com.charl.blog.entity.Category;
import com.charl.blog.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: blog
 * @description:
 * @author: charl
 * @create: 2018-07-23 17:45
 **/
@Service
public class CategoryService implements ICategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public int addCategory(Category category) {
        Category save = categoryRepository.save(category);
        return save.getId();
    }
}
