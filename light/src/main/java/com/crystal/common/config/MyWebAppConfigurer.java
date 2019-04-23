package com.crystal.common.config;

import com.crystal.common.interceptors.LoginInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author crystalzhao
 * @version V1.0
 * @date 2019/4/23
 */
@Configuration
public class MyWebAppConfigurer extends WebMvcConfigurationSupport {
    /*@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/myres/**").addResourceLocations("classpath:/myres/");
        super.addResourceHandlers(registry);
    }*/
    @Value("${adminPath}")
    private String adminPath;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(logInterceptor()).addPathPatterns(adminPath + "/**");
    }
    @Bean
    public LoginInterceptor logInterceptor() {
        return new LoginInterceptor();
    }
}

