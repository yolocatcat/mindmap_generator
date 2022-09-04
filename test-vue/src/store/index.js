import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

const store = new Vuex.Store({
  state: {
    user: {
      // 本地储存
      username:
        window.localStorage.getItem('user' || '[]') == null
          ? ''
          : JSON.parse(window.localStorage.getItem('user' || '[]')).username
    }
  },
  mutations: {
    login (state, user) {
      state.user = user
      window.localStorage.setItem('user', JSON.stringify(user))
    },
    logout (state) {
      state.user = []
      window.localStorage.removeItem('user')
    }
  },
  getters: {
    username: state => state.user.username
  }
})
export default store
