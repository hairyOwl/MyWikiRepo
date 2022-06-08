package com.owl.wiki;

/**
 * @description: 主程序类
 * @version: 1.0
 * @author: 小哈
 * @date: 2022/6/7 10:33
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

//@ComponentScan({"com.owl","com.test"})//非根目录的启动类扫描
@SpringBootApplication
public class WikiApplication {

    public static final Logger LOG = LoggerFactory.getLogger(WikiApplication.class);

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(WikiApplication.class);
        Environment env = app.run(args).getEnvironment();

        LOG.info("启动成功");
        LOG.info("地址：\thttp://localhost:{}",env.getProperty("server.port"));
    }

}
