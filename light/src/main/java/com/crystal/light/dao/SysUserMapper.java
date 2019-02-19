package com.crystal.light.dao;

import com.crystal.light.entity.SysUser;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface SysUserMapper {
    int deleteByPrimaryKey(String id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

    List<SysUser> findList();
}