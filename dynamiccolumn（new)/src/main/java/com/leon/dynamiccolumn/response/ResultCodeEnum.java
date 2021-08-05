package com.leon.dynamiccolumn.response;

import lombok.Getter;

@Getter
public enum ResultCodeEnum {

    SUCCESS(true, 20000, "成功"),
    UNKNOWN_ERROR(false, 20001, "未知错误"),
    PARAM_ERROR(false, 20002, "参数错误"),
    HTTP_CLIENT_ERROR(false, 20003, "http客户端错误"),
    NULL_POINT(false, 20004, "空指针异常"),
    UNEXIST_COLUMN(false, 20005, "列不存在"),
    UNEXIST_TABLE(false, 20006, "表不存在"),
    CONFLICT_TITLE(false, 20007, "标题重复"),
    DUPLICATE_COLUMN(false, 20008, "列重复"),
    ;

    // 响应是否成功
    private Boolean success;
    // 响应状态码
    private Integer code;
    // 响应信息
    private String message;

    ResultCodeEnum(boolean success, Integer code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }
}
