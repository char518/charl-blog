package com.charl.blog.vo.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @program: blog
 * @description:
 * @author: charl
 * @create: 2018-07-24 16:35
 **/
@ApiModel(description = "添加博客")
public class AddPostVo {

    @ApiModelProperty(value = "标题")
    private String title;

    @ApiModelProperty(value = "内容")
    private String content;

    @ApiModelProperty(value = "作者ID")
    private Integer authorId;

    @ApiModelProperty(value = "分类ID")
    private Integer categoryId;

    @ApiModelProperty(value = "访问数")
    private Integer visits;

}
