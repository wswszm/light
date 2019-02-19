package com.crystal.light.service;

import com.crystal.light.dao.SysUserMapper;
import com.crystal.light.entity.SysUser;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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
        sysUserMapper.insert(sysUser);
    }
    public List<SysUser> selectList(){
        PageHelper.startPage(0,5,"username asc");
        return sysUserMapper.findList();
    }
}
