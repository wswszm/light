package com.crystal.light.service;

import com.crystal.light.dao.SysUserMapper;
import com.crystal.light.entity.SysUser;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
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
    @Autowired
    private StringRedisTemplate redisTemplate;


    public void save(SysUser sysUser){
        sysUserMapper.insert(sysUser);
    }
    public List<SysUser> selectList(){
        PageHelper.startPage(0,5,"username asc");
        return sysUserMapper.findList();
    }
    public String getRedis(){
        redisTemplate.opsForValue().set("2", "4");
        Object o = redisTemplate.opsForValue().get("2");
        return String.valueOf(o);
    }
}
