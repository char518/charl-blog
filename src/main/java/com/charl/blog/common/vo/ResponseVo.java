package com.charl.blog.common.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @program: blog
 * @description:
 * @author: charl
 * @create: 2018-07-20 11:13
 **/
@Data
public class ResponseVo implements Serializable {

    private int code;

    private String msg;

    private Object data;

    public ResponseVo() {
    }

    public ResponseVo(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <T> ResponseVo buildSuccessInstance(T t) {
        return new ResponseVo(1, "success", t);
    }

    public static ResponseVo buildSuccessInstance() {
        return new ResponseVo(1, "success", null);
    }

    public static <T> ResponseVo buildFailedInstance(T t) {
        return new ResponseVo(2, "failed", t);
    }

    public static ResponseVo buildFailedInstance() {
        return new ResponseVo(1, "failed", null);
    }

    public static ResponseVo buildFailedInstance(String msg) {
        return new ResponseVo(1, msg, null);
    }

}
