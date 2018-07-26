package com.charl.blog.vo.request;

import com.charl.blog.common.vo.BasePageVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @program: blog
 * @description:
 * @author: charl
 * @create: 2018-07-24 17:37
 **/
@Data
@ApiModel(description = "查询博客列表")
public class QueryPostsVo extends BasePageVo {

    @ApiModelProperty("文章标题")
    private String title;

    @ApiModelProperty("文章创建时间")
    private Date addTime;

}
