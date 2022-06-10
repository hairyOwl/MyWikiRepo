# MyWikiRepo
Vue3+SpringBoot 知识库搭建

# 前后端分离
- 前端在wiki-front分支
- 后端在wiki-back分支

## 后端环境
- spring boot 2.4.0
- jdk 8
- mysql 8

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
├─ pom.xml
├─ src
src
│    ├─  main
│    │     ├─ java
│    │     │    └─ com.owl.wiki
│    │     │        ├─ domain //实体类与数据表的映射
│    │     │        ├─ mapper //持久层 接口
│    │     │        ├─ service //服务层
│    │     │        ├─ controller
│    │     │        │       └─ TestController.java
│    │     │        └─ WikiApplication.java
│    │     └─ resources
│    │           ├─ mapper //sql 脚本
│    │           ├─ application.properties  //项目配置
│    │           ├─ banner.txt   //spring boot启动样式
│    │           └─ logback-spring.xml //logback样式
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