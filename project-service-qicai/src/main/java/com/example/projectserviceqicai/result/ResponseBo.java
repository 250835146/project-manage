package com.example.projectserviceqicai.result;


import lombok.Data;

/**
 * 业务层结果输出类
 */

@Data
public class ResponseBo<T> {


    private T data;
    private String code;
    private String message;
    private boolean success = false;


    /**
     * 构造函数，通过返回对象构造对象
     *
     * @param result
     */
    public ResponseBo(T result) {
        this(new ResultStatus(), result);
    }


    public ResponseBo(ResultStatus resultStatus) {
        this.code = resultStatus.getCode();
        this.message = resultStatus.getMessage();
        if (ResultStatusEnum.SUCCESS.getCode().equals(resultStatus.getCode())){
            this.success = true;
        }else {
            this.success = false;
        }
    }

    public ResponseBo(ResultStatus resultStatus, T data) {
        this(resultStatus);
        this.data = data;
        this.success = true;
    }


    public ResponseBo(ResultStatusEnum resultStatusEnum) {
        this.code = resultStatusEnum.getCode();
        this.message = resultStatusEnum.getMessage();
        this.success = ResultStatusEnum.SUCCESS.getCode().equals(resultStatusEnum.getCode());
    }

    public ResponseBo(ResultStatusEnum resultStatusEnum, T data) {
        this(resultStatusEnum);
        this.data = data;
    }

    public ResponseBo() {
    }
}
