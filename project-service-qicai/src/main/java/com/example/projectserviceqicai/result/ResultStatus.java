package com.example.projectserviceqicai.result;

import lombok.Data;

@Data
public class ResultStatus {
    
    private String code;
    private String message;

    

    public ResultStatus(ResultStatusEnum resultStatusEnum) {
        this.code = resultStatusEnum.getCode();
        this.message = resultStatusEnum.getMessage();
    }
    
    
    /**
     * @param code
     * @param message
     */
    public ResultStatus(String code, String message) {
        this.code = code;
        this.message = message;
    }
    
    /**
     * 
     */
    public ResultStatus() {
        this.code=ResultStatusEnum.SUCCESS.getCode();
        this.message=ResultStatusEnum.SUCCESS.getMessage();
    }
    

}
