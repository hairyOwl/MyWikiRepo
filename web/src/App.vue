<!--
 * @Description: 
 * @Author: hairyOwl
 * @Date: 2022-06-13 15:46:23
 * @LastEditors: hairyOwl
 * @LastEditTime: 2022-06-15 10:10:00
-->
<template>
  <a-config-provider :locale="locale === 'en' ? enUS : zhCN">
    <a-layout>
      <!-- 页头 -->
      <the-header />
      <!-- 左右结构 侧边栏+内容-->
      <router-view />
      <!-- 页脚 -->
      <the-footer />
    </a-layout>
  </a-config-provider>
</template>

<script>
  import { defineComponent, ref } from 'vue';
  import TheHeader from '@/components/TheHeader.vue'
  import TheFooter from '@/components/TheFooter.vue'
  import enUS from 'ant-design-vue/es/locale/en_US';
  import zhCN from 'ant-design-vue/es/locale/zh_CN';

  export default defineComponent({
    components:{
      TheHeader,
      TheFooter,
    },

    setup() {
      return {
        enUS,
        zhCN,
      };
    },

  });
</script>

<style>
#components-layout-demo-top-side-2 .logo {
  float: left;
  width: 120px;
  height: 31px;
  margin: 16px 24px 16px 0;
  background: rgba(255, 255, 255, 0.3);
}

.ant-row-rtl #components-layout-demo-top-side-2 .logo {
  float: right;
  margin: 16px 0 16px 24px;
}

.site-layout-background {
  background: #fff;
}
</style>