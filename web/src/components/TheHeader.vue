<!--
 * @Description: 页头组件
 * @Author: hairyOwl
 * @Date: 2022-06-14 22:38:53
 * @LastEditors: hairyOwl
 * @LastEditTime: 2022-06-25 10:15:29
-->
<template>
    <a-layout-header class="header">
        <div class="logo" />
        <a-menu
            theme="dark"
            mode="horizontal"
            :style="{ lineHeight: '64px' }"
        >
            <a-menu-item key="Home">
                <router-link to="/">首页</router-link>
            </a-menu-item>
            <a-menu-item key="AdminEbook">
                <router-link to="/admin/ebook">电子书管理</router-link>
                </a-menu-item>
            <a-menu-item key="About">
                <router-link to="/about">关于我们</router-link>
            </a-menu-item>
        </a-menu>
    </a-layout-header>
</template>


