//package com.owl.wiki.config;
//
//import com.owl.wiki.interceptor.LogInterceptor;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//import javax.annotation.Resource;
//
///**
// * @description: 拦截器配置
// * @version: 1.0
// * @author: 小哈
// * @date: 2022/6/20 15:33
// */
//@Configuration
//public class SpringMvcConfig implements WebMvcConfigurer {
//
//    @Resource
//    LogInterceptor logInterceptor; //注入拦截器
//
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(logInterceptor) //注册拦截器
//                .addPathPatterns("/**"); //针对所有的请求使用logInterceptor
//    }
//}
