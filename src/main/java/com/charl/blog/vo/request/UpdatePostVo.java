package com.charl.blog.vo.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @program: blog
 * @description:
 * @author: charl
 * @create: 2018-07-24 16:35
 **/
@Data
@ApiModel(description = "修改博客")
public class UpdatePostVo {

    @ApiModelProperty(value = "ID")
    @NotNull(message = "ID不能为空")
    private Integer id;

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
