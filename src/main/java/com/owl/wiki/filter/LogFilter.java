//package com.owl.wiki.filter;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Component;
//
//import javax.servlet.*;
//import javax.servlet.http.HttpServletRequest;
//import java.io.IOException;
//
///**
// * @description: 日志过滤器
// * @version: 1.0
// * @author: 小哈
// * @date: 2022/6/19 20:51
// */
//@Component
//public class LogFilter implements Filter {
//
//    private static final Logger LOG = LoggerFactory.getLogger(LogFilter.class);
//
//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException {
//
//    }
//
//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        // 打印请求信息
//        HttpServletRequest request = (HttpServletRequest) servletRequest;
//        LOG.info("------------- LogFilter 开始-------------");
//        //请求地址请求方法
//        LOG.info("请求地址: {} {}", request.getRequestURL().toString(), request.getMethod());
//        //访问ip
//        LOG.info("远程地址: {}", request.getRemoteAddr());
//
//        //开始时间
//        long startTime = System.currentTimeMillis();
//        filterChain.doFilter(servletRequest, servletResponse); //如果有其他过滤器，执行其他
//        LOG.info("------------- LogFilter 结束 耗时:{}ms -------------", System.currentTimeMillis() - startTime);
//    }
//}
//
