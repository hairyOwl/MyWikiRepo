<!--
 * @Description: 主页面
 * @Author: hairyOwl
 * @Date: 2022-06-13 15:46:23
 * @LastEditors: hairyOwl
 * @LastEditTime: 2022-06-16 22:05:49
-->
<template>
  <a-layout>
        <!-- 侧边栏 -->
        <a-layout-sider width="200" style="background: #fff">
          <a-menu
            mode="inline"
            :style="{ height: '100%', borderRight: 0 }"
          >
            <a-sub-menu key="sub1">
              <template #title>
                <span>
                  subnav 122
                </span>
              </template>
              <a-menu-item key="1">option1</a-menu-item>
              <a-menu-item key="2">option2</a-menu-item>
              <a-menu-item key="3">option3</a-menu-item>
              <a-menu-item key="4">option4</a-menu-item>
            </a-sub-menu>
            <a-sub-menu key="sub2">
              <template #title>
                <span>
                  subnav 2
                </span>
              </template>
              <a-menu-item key="5">option5</a-menu-item>
              <a-menu-item key="6">option6</a-menu-item>
              <a-menu-item key="7">option7</a-menu-item>
              <a-menu-item key="8">option8</a-menu-item>
            </a-sub-menu>
            <a-sub-menu key="sub3">
              <template #title>
                <span>
                  subnav 3
                </span>
              </template>
              <a-menu-item key="9">option9</a-menu-item>
              <a-menu-item key="10">option10</a-menu-item>
              <a-menu-item key="11">option11</a-menu-item>
              <a-menu-item key="12">option12</a-menu-item>
            </a-sub-menu>
          </a-menu>
        </a-layout-sider>
        <!-- 内容 -->
        <a-layout-content
            :style="{ background: '#fff', padding: '24px', margin: 0, minHeight: '280px' }"
          >
            <pre>{{ ebooks }}</pre>
            <pre>{{ ebooks1 }}</pre>
            <pre>{{ books }}</pre>
        </a-layout-content>
  </a-layout>
</template>

<script lang="ts">
import { defineComponent,onMounted,ref ,reactive , toRef } from 'vue';
import axios from 'axios'

export default defineComponent({
  name: 'Home',
  setup(){
    console.log('setup');
    const ebooks = ref(); //响应式数据
    const ebooks1 = reactive({books:[]}); //响应式数据

    onMounted(()=>{
      console.log('onMounted');
      axios.get('http://localhost:8888/ebook/list?name=').then((response) =>{
        const data  = response.data;
        ebooks.value = data.content;
        ebooks1.books = data.content;
        
      });
    });

    return{
      ebooks,
      books : toRef(ebooks1, 'books'),
      ebooks1,
    }
  }
});
</script>
