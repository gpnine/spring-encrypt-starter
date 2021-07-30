package com.javazcl.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * .
 *
 * @Author Chenglin Zhu
 * @Date 2021/7/30 9:50 上午
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RespBean {
    private Integer status;
    private String msg;
    private Object obj;

    public static RespBean bulid() {
        return new RespBean();
    }

    public static RespBean ok(String msg) {
        return new RespBean(200, msg, null);
    }

    public static RespBean ok(String msg, Object obj) {
        return new RespBean(200, msg, obj);
    }

    public static RespBean error(String msg) {
        return new RespBean(500, msg, null);
    }

    public static RespBean error(String msg, Object obj) {
        return new RespBean(500, msg, obj);
    }
}
