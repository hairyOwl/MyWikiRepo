package com.owl.wiki.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @description: 跨域配置
 * @version: 1.0
 * @author: 小哈
 * @date: 2022/6/15 16:06
 */

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") //映射的请求地址 所有的接口地址
                .allowedOriginPatterns("*")  //允许来源 所有
                .allowedHeaders(CorsConfiguration.ALL) //允许的请求头 所有
                .allowedMethods(CorsConfiguration.ALL) //允许的请求方法 所有
                .allowCredentials(true)//允许携带凭证 如 cookie
                .maxAge(3600); //1h内不需要再预检(发送OPTIONS请求)
    }
}
