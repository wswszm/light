package com.crystal.light.schedule;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author crystalzhao
 * @version V1.0
 * @date 2019/4/23
 */
@Component
public class ScheduleTask {
//    @Scheduled(cron = "0/5 * * * * ?")
    public void test(){
        System.out.println("#############################");
    }
}
