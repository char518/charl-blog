package com.charl.blog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: charl-blog
 * @description:
 * @author: charl
 * @create: 2018-07-19 16:53
 **/
@RestController
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "Project start success!!!";
    }

}
