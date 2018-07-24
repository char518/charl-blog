package com.charl.blog.common.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @program: blog
 * @description:
 * @author: charl
 * @create: 2018-07-20 13:46
 **/
@Data
public class BasePageVo implements Serializable {

    private int pageNo = 1;

    private int pageSize = 10;

    public static int getStart(int pageNo, int pageSize) {
        return (pageNo - 1) * pageSize;
    }

}
