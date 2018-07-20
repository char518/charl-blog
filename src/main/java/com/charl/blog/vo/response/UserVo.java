package com.charl.blog.vo.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @program: blog
 * @description:
 * @author: charl
 * @create: 2018-07-20 11:21
 **/
@Data
@ApiModel(value = "用户返回信息")
public class UserVo {

    @ApiModelProperty("用户ID")
    private Integer id;

    @ApiModelProperty("用户名")
    private String name;

    @ApiModelProperty("手机号码")
    private String mobile;

    @ApiModelProperty("头像")
    private String image;

    @ApiModelProperty("昵称")
    private String alias;

    @ApiModelProperty("邮箱")
    private String email;

}
