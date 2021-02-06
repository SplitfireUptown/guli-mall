package com.uptown.common.exception;

import lombok.Data;

/**
 * @author: Lixiaofei
 * @date: 2021/2/6 20:57
 */

public enum BizCodeEnum {

    UNKONW_EXCEPTION(10000, "系统未知异常"),
    BAILD_EXCEPTION(10001, "参数格式校验失败");


    private Integer code;

    private String errorMsg;

    BizCodeEnum(Integer code, String errorMsg) {
        this.code = code;
        this.errorMsg = errorMsg;
    }

    public Integer getCode() {
        return code;
    }

    public String getErrorMsg() {


    }
}
