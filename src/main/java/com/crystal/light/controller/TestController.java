package com.crystal.light.controller;

import com.crystal.light.entity.SysUser;
//import com.crystal.light.kafka.Producer;
import com.crystal.light.service.TestService;
import com.crystal.light.vo.TestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.File;
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
//    @Autowired
//    private Producer producer;


    @GetMapping("testArthas")
    public Object test(){
        String id = testService.testArthas("aaa", "bbb");
        return id;
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

//    @PostMapping("testKafka")
//    public String testKafka(){
//        TestVO vo = new TestVO();
//        vo.setFrontJson("dasbidabhdiabsda");
//        vo.setUuid(UUID.randomUUID().toString());
//        producer.send(vo);
//        return "success";
//    }

    public static void main(String[] args) {
        File file = new File("D:\\workspace\\logs\\spoc\\spoc.log");
        System.out.println(file.getPath());
        System.out.println(file.getName());
    }


}
