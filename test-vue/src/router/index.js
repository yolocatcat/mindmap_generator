import Vue from 'vue'
import VueRouter from 'vue-router'
import Login from '@/components/Login'
import AppIndex from '@/components/AppIndex'
import Home from '@/components/Home'
import InfoIndex from '@/components/InfoIndex'
import AdminIndex from '@/components/AdminIndex'
import Register from '@/components/Register'
import TextIndex from '@/components/TextIndex'
import HistoryIndex from '@/components/common/HistoryIndex'
import Markmap from '@/components/Markmap'
import EditMap from '@/components/common/EditMap'

Vue.use(VueRouter)

const router = new VueRouter({
  mode: 'history',
  routes: [
    {
      path: '/',
      redirect: '/login'
    },
    {
      path: '/login',
      name: 'Login',
      component: Login
    },
    {
      path: '/register',
      name: 'Register',
      component: Register
    },
    {
      path: '/home',
      name: 'Home',
      component: Home,
      redirect: '/index',
      children: [
        {
          path: '/index',
          name: 'AppIndex',
          component: AppIndex,
          meta: {
            requireAuth: true
          }
        },
        {
          path: '/start',
          name: 'TextIndex',
          component: TextIndex,
          meta: {
            requireAuth: true
          }
        },
        {
          path: '/mindmap',
          name: 'Markmap',
          component: Markmap,
          meta: {
            requireAuth: true
          }
        },
        {
          path: '/recommend',
          name: 'InfoIndex',
          component: InfoIndex,
          meta: {
            requireAuth: true
          }
        },
        {
          path: '/edit',
          name: 'EditMap',
          component: EditMap,
          meta: {
            requireAuth: true
          }
        },
        {
          path: '/admin',
          name: 'AdminIndex',
          component: AdminIndex,
          redirect: '/admin/history',
          meta: {
            requireAuth: true
          },
          children: [
            {
              path: 'history',
              name: 'HistoryIndex',
              component: HistoryIndex,
              meta: {
                requireAuth: true
              }
            }
          ]
        }
      ]
    }
  ]
})
export default router
