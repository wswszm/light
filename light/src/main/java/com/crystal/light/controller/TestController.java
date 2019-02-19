package com.crystal.light.controller;

import com.crystal.light.entity.SysUser;
import com.crystal.light.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author crystalzhao
 * @version V1.0
 * @date 2019/2/18
 */
@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("test")
    public Object test(){
        return testService.selectList();
    }
}
