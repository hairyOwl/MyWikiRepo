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
│    ├─ httpRequests  \\HTTP Client执行日志
├─ doc  \\项目的文档
│    └─ all.sql \\数据库脚本
├─ http  \\HTTP Client测试脚本
│    └─ test.http
├─ log   \\logback日志
│    ├─ error.log
│    ├─ trace.2022-06-08.0.log
│    └─ trace.log
├─ pom.xml
├─ src
│    ├─ main
│    │    ├─ java
│    │    └─ resources
│    └─ test
│           └─ java
└─ wiki-back.iml
```

## 功能or开发流程
### 1.配置
 - 环境配置
 - 日志优化(Logback)
 - 集成热部署