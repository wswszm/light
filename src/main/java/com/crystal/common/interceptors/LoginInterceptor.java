package com.crystal.common.interceptors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;

/**
 * @author crystalzhao
 * @version V1.0
 * @date 2019/4/23
 */
public class LoginInterceptor implements HandlerInterceptor {

    /**
     * 日志对象
     */
    protected Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
                              Object handler) throws Exception{
        if (logger.isDebugEnabled()){
            long beginTime = System.currentTimeMillis();//1、开始时间
            logger.debug("开始计时: {}  URI: {}", new SimpleDateFormat("HH:mm:ss.SSS")
                    .format(beginTime), request.getRequestURI());
        }
        return true;
    }
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView)throws Exception{

    }
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
    }
}
