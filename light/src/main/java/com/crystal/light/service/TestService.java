package com.crystal.light.service;

import com.crystal.light.dao.SysUserMapper;
import com.crystal.light.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author crystalzhao
 * @version V1.0
 * @date 2019/2/19
 */
@Service
public class TestService {
    @Autowired
    private SysUserMapper sysUserMapper;
    public void save(SysUser sysUser){
        sysUserMapper.insertSelective(sysUser);
    }
}
