
package com.example.projectserviceqicai.result;

import lombok.Data;

/**
 * 返回枚举类
 */

public enum ResultStatusEnum {
    SUCCESS("200","成功")
    ;


    private String code;
    private String message;


    ResultStatusEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
