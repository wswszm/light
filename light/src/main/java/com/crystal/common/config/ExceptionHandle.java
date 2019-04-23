package com.crystal.common.config;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 * @author crystalzhao
 * @version V1.0
 * @date 2019/4/23
 */
@ControllerAdvice
public class ExceptionHandle {
    @ExceptionHandler(value = Exception.class)
    public void ExceptionHandler(HttpServletRequest req, Exception e){
        System.out.println(req.getContextPath());
        e.printStackTrace();
    }
}
