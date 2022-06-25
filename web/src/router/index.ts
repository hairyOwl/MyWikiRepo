/*
 * @Description: 
 * @Author: hairyOwl
 * @Date: 2022-06-13 15:46:23
 * @LastEditors: hairyOwl
 * @LastEditTime: 2022-06-25 10:10:57
 */
import { createRouter, createWebHistory, RouteRecordRaw } from 'vue-router'
import Home from '../views/Home.vue'

const routes: Array<RouteRecordRaw> = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path: '/about',
    name: 'About',
    component: () => import(/* webpackChunkName: "about" */ '../views/About.vue')
  },
  {
    path: '/admin/ebook',
    name: 'AdminEbook',
    component: () => import(/* webpackChunkName: "about" */ '../views/Admin/AdminEbook.vue')
  },
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
