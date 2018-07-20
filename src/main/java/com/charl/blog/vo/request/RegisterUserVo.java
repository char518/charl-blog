package com.charl.blog.vo.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @program: blog
 * @description:
 * @author: charl
 * @create: 2018-07-20 10:10
 **/
@Data
@ApiModel("注册用户VO")
public class RegisterUserVo {

    @ApiModelProperty(value = "用户名")
    private String name;

    @ApiModelProperty(value = "昵称")
    private String alias;

    @ApiModelProperty(value = "手机号码")
    private String mobile;

    @ApiModelProperty(value = "email")
    private String email;

    @ApiModelProperty(value = "密码")
    private String password;

}
