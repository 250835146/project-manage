package com.example.projectserviceqicai.dto;

import lombok.Data;

@Data
public class BaseDTO<T> {
    private ReqHeader reqHeader;
    private T reqBody;


    @Data
    public static class ReqHeader {
        private String token;
        private String userId;
    }
}
