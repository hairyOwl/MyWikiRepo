/*
 * @Description: 
 * @Author: hairyOwl
 * @Date: 2022-06-13 15:46:23
 * @LastEditors: hairyOwl
 * @LastEditTime: 2022-06-19 20:22:38
 */
import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import Antd from 'ant-design-vue';
import 'ant-design-vue/dist/antd.css';
import axios from 'axios';

// 设置请求的前缀
axios.defaults.baseURL = process.env.VUE_APP_SERVER;
/* 
    axios拦截器
*/
// 请求
axios.interceptors.request.use(function(config){
    console.log('请求参数',config);
    return config;
},error =>{
    return Promise.reject(error);
});
//响应
axios.interceptors.response.use(function(response){
    console.log('响应结果',response);
    return response;
},error =>{
    console.log('响应错误',error);
    return Promise.reject(error);
});


const app = createApp(App);
app.use(store)
    .use(router)
    .use(Antd)
    .mount('#app');

console.log('环境：',process.env.NODE_ENV);
console.log('服务端：',process.env.VUE_APP_SERVER);
