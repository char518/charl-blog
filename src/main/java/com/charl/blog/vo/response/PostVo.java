package com.charl.blog.vo.response;

import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @program: blog
 * @description:
 * @author: charl
 * @create: 2018-07-24 17:17
 **/
public class PostVo {

    @ApiModelProperty("主键ID")
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

    @ApiModelProperty("添加时间")
    private LocalDateTime addTime;

    private String addTimeStr;

    @ApiModelProperty("更新时间")
    private LocalDateTime updateTime;

    private String updateTimeStr;

    public String getAddTimeStr() {
        return DateTimeFormatter.ofPattern("YYYY-MM-dd:HH:mm:ss").format(addTime);
    }

    public String getUpdateTimeStr() {
        return DateTimeFormatter.ofPattern("YYYY-MM-dd:HH:mm:ss").format(updateTime);
    }

}
