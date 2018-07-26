package com.charl.blog.vo.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @program: blog
 * @description:
 * @author: charl
 * @create: 2018-07-24 17:17
 **/
@ApiModel(description = "帖子返回VO")
@Data
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
    private Date addTime;

    private String addTimeStr;

    @ApiModelProperty("更新时间")
    private Date updateTime;

    private String updateTimeStr;

    public String getAddTimeStr() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return format.format(addTime);
    }

    public String getUpdateTimeStr() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return format.format(updateTime);
    }

}
