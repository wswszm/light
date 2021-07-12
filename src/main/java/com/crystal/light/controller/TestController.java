package com.crystal.light.controller;

import com.crystal.light.entity.SysUser;
import com.crystal.light.service.TestService;
import com.crystal.light.vo.TestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @author crystalzhao
 * @version V1.0
 * @date 2019/2/18
 */
@RestController
@RequestMapping("sheet")
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("test")
    public Object test(){
        SysUser user = new SysUser();
        user.setId(UUID.randomUUID().toString());
        user.setLoginName("245");
        user.setName("245");
        user.setPassword("245");
        user.setCreateBy("1");
        user.setCreateDate(new Date());
        user.setUpdateBy("1");
        user.setUpdateDate(new Date());
        testService.save(user);
        return user;
    }

    @PostMapping("saveFrontJson")
    public Object saveFrontJson(@RequestParam String frontJson, @RequestParam String uuid){
        System.out.println(frontJson);
        System.out.println(uuid);
        Map<String ,Object> map = new HashMap<>();
        map.put("result","success");
        return map;
    }

    @PostMapping("testFen")
    public String testFen(){
        testService.testFen();
        return "success";
    }

    @PostMapping("gaifen")
    public String gaifen(@RequestParam String yjKsBh){
        testService.gaifen(yjKsBh);
        return "success";
    }
}
