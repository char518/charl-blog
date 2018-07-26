package com.charl.blog.common.vo;

import lombok.Data;

import java.util.List;

/**
 * @program: blog
 * @description:
 * @author: charl
 * @create: 2018-07-26 14:15
 **/
@Data
public class BasePageRespVo<T> {

    private List<T> data;

    private int totalCount;

    private int pageSize;

    private int pageNo;

    public BasePageRespVo(List<T> data, int totalCount, int pageSize, int pageNo) {
        this.data = data;
        this.totalCount = totalCount;
        this.pageSize = pageSize;
        this.pageNo = pageNo;
    }

    public static <T> BasePageRespVo buildBaseResp(List<T> data, int totalCount) {
        return new BasePageRespVo(data, totalCount, 1, 10);
    }
}
