package com.st.common.tool;

import com.st.common.constant.HttpStatus;

import java.util.HashMap;
import java.util.Map;

/**
 * @author neei
 * @date 2020/4/4 12:22
 * @desc 游学网  -- 通用返回对象
 */


public class StResult extends HashMap<String, Object> {
    private static final long serialVersionUID = 1L;

    public StResult() {
        put("code", 0);
        put("msg", "success");
    }

    public static StResult error() {
        return error(HttpStatus.SC_INTERNAL_SERVER_ERROR, "未知异常，请联系管理员");
    }

    public static StResult error(String msg) {
        return error(HttpStatus.SC_INTERNAL_SERVER_ERROR, msg);
    }

    public static StResult error(int code, String msg) {
        StResult r = new StResult();
        r.put("code", code);
        r.put("msg", msg);
        return r;
    }

    public static StResult ok(String msg) {
        StResult r = new StResult();
        r.put("msg", msg);
        return r;
    }

    public static StResult ok(Map<String, Object> map) {
        StResult r = new StResult();
        r.putAll(map);
        return r;
    }

    public static StResult ok() {
        return new StResult();
    }

    public StResult put(String key, Object value) {
        super.put(key, value);
        return this;
    }
    public  Integer getCode() {

        return (Integer) this.get("code");
    }

}
