package com.percent.filtertry01.config;

import com.percent.filtertry01.component.MyHandlerInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyMvcConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //除了 /index 请求，所有请求都过拦截器
        registry.addInterceptor(new MyHandlerInterceptor()).addPathPatterns("/**")
                .excludePathPatterns("/index");
    }
}
