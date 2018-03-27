package com.zhang.mooc.mapper;

import com.zhang.mooc.entity.SysLogin;

public interface SysLoginMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysLogin record);

    int insertSelective(SysLogin record);

    SysLogin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysLogin record);

    int updateByPrimaryKey(SysLogin record);
}