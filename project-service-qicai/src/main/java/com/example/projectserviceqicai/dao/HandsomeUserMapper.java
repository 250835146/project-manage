package com.example.projectserviceqicai.dao;

import com.example.projectserviceqicai.model.HandsomeUser;

public interface HandsomeUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HandsomeUser record);

    int insertSelective(HandsomeUser record);

    HandsomeUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HandsomeUser record);

    int updateByPrimaryKey(HandsomeUser record);
}