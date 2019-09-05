package com.example.projectserviceqicai.model;

import lombok.Data;

import java.util.Date;

@Data
public class HandsomeUser {
    private Integer id;

    private String userName;

    private String loginName;

    private String password;

    private Byte phone;

    private String email;

    private String telephone;

    private Integer state;

    private Integer loginState;

    private String remarks;

    private Date createTime;

    private Date updateTime;

    private Integer createBy;

    private Integer updateBy;

}