<!--
 * @Description: 主页面
 * @Author: hairyOwl
 * @Date: 2022-06-13 15:46:23
 * @LastEditors: hairyOwl
 * @LastEditTime: 2022-06-17 16:54:06
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
                  subnav 1
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
            <!-- grid栅格列表 gutter间距column3列-->
            <a-list 
              item-layout="vertical" 
              size="large" 
              :pagination="disabled"
              :grid = "{gutter:20 , column:3}" 
              :data-source="ebooks"
            >
              <template #renderItem="{ item }">
                <a-list-item key="item.name">
                  <!-- 评论数 -->
                  <template #actions>
                    <span v-for="{ type, text } in actions" :key="type">
                      <component :is="type" style="margin-right: 8px" />
                      {{ text }}
                    </span>
                  </template>
                  <!-- 描述 -->
                  <a-list-item-meta :description="item.description">
                    <template #title>
                      <!-- 课程名 -->
                      <a :href="item.href">{{ item.name }}</a>
                    </template>
                    <template #avatar><a-avatar :src="item.cover" /></template>
                  </a-list-item-meta>
                </a-list-item>
              </template>
            </a-list>
        </a-layout-content>
  </a-layout>
</template>

<script lang="ts">
import { defineComponent,onMounted,ref } from 'vue';
import { StarOutlined, LikeOutlined, MessageOutlined } from '@ant-design/icons-vue';
import axios from 'axios'

export default defineComponent({
  name: 'Home',
  components: {
    StarOutlined,
    LikeOutlined,
    MessageOutlined,
  },
  setup(){
    const ebooks = ref();
    const pagination = {
      onChange: (page: number) => {
        console.log(page);
      },
      pageSize: 3,
    };
    const actions: Record<string, string>[] = [
      { type: 'StarOutlined', text: '156' },
      { type: 'LikeOutlined', text: '156' },
      { type: 'MessageOutlined', text: '2' },
    ];
    onMounted(()=>{
      console.log('onMounted');
      axios.get('http://localhost:8888/ebook/list').then((response) =>{
        const data  = response.data;
        ebooks.value = data.content;
      });
    });

    return{
      ebooks,
      pagination,
      actions,
    }
  }
});
</script>

<style lang="scss" scoped>
  .ant-avatar{
    width: 50px;
    height: 50px;
    line-height: 50px;
    border-radius: 8%;
    margin: 5px 0;
  } 
</style>