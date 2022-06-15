<!--
 * @Description: 页头组件
 * @Author: hairyOwl
 * @Date: 2022-06-14 22:38:53
 * @LastEditors: hairyOwl
 * @LastEditTime: 2022-06-14 22:51:44
-->
<template>
    <a-layout-header class="header">
        <div class="logo" />
        <a-menu
            v-model:selectedKeys="selectedKeys1"
            theme="dark"
            mode="horizontal"
            :style="{ lineHeight: '64px' }"
        >
            <a-menu-item key="1">nav 1</a-menu-item>
            <a-menu-item key="2">nav 2</a-menu-item>
            <a-menu-item key="3">nav 3</a-menu-item>
        </a-menu>
    </a-layout-header>
</template>

// // 自定义组件注册
