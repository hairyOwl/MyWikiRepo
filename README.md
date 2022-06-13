# MyWikiRepo
Vue3+SpringBoot 知识库搭建  [相关笔记](https://github.com/hairyOwl/MyWikiRepo/wiki)

## 项目环境
### 后端
- spring boot 2.4.0
- jdk 8
- mysql 8
### 前端
- vue3

## 项目文件夹
```
wiki-back
├─ .idea
│    ├─ httpRequests   //HTTP Client执行日志
├─ doc  //项目的文档
│    └─ all.sql //数据库脚本
├─ http  \\HTTP Client测试脚本
│    └─ test.http
├─ log   //logback日志
│    ├─ error.log
│    ├─ trace.2022-06-08.0.log
│    └─ trace.log
├─ web   //前端代码路径 Vue3
├─ src
│    ├─  main
│    │     ├─ java
│    │     │    └─ com.owl.wiki
│    │     │        ├─ controller
│    │     │        ├─ domain //实体类与数据表的映射
│    │     │        ├─ mapper //持久层 接口
│    │     │        ├─ request //请求体封装
│    │     │        ├─ response //返回体通用处理
│    │     │        ├─ service //服务层
│    │     │        ├─ utils //工具类
│    │     │        └─ WikiApplication.java //主程序类
│    │     └─ resources
│    │           ├─ generator //Mybatis Generator
│    │           ├─ mapper //sql 脚本
│    │           ├─ application.properties  //项目配置
│    │           ├─ banner.txt   //spring boot启动样式
│    │           └─ logback-spring.xml //logback样式
├─ pom.xml
└─ wiki-back.iml
```

## 功能or开发流程
### 1.配置
 - 环境配置
 - 日志优化(Logback)
 - 集成热部署
### 2.数据库准备
 - 创建数据库wiki和只使用wiki的用户
 - 添加Mybatis，mysql依赖 
 - 项目配置文件中配置数据源