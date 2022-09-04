<template>
  <div class="containerB">
    <header>
      <el-button @click="edit" style="color: white;background-color: transparent;">去创作思维导图 →</el-button>
    </header>
<div class="main-section">
  <div class="clear-backend">
    <div class="avatar">
      <el-avatar :size="90" >{{$store.state.user.username}}</el-avatar>
    </div>
    <div class="menu">
      <el-row class="tac">
        <el-col :span="35">
          <el-menu :default-active="this.$route.path" router
            text-color="blue" active-text-color="white" background-color="transparent">
            <el-menu-item v-for="(item,i) in navList" :key="i" :index="item.name">
              {{ item.navItem }}
            </el-menu-item>
          </el-menu>
          <el-popover placement="right" width="160" v-model="visible">
            <p>确定要退出登录吗？</p>
            <div style="text-align: right; margin: 0">
              <el-button size="mini" type="text" @click="visible = false">取消</el-button>
              <el-button type="primary" size="mini" @click="logout">确定</el-button>
            </div>
            <el-button slot="reference" class="el-menu-item">退出登录</el-button>
          </el-popover>
        </el-col>
      </el-row>
    </div>
  </div>
    <transition name="el-zoom-in-bottom">
      <div class="tab-content" v-show="show">
        <router-view></router-view>
      </div>
    </transition>
  </div>
</div>
</template>

<script>
export default {
  name: 'AdminIndex',
  methods: {
    edit () {
      this.$router.replace('/edit')
    },
    logout () {
      this.visible = false
      this.$store.commit('logout')
      this.$router.replace('/login')
    }
  },
  data () {
    return {
      navList: [
        {name: '/admin/history', navItem: '历史记录'}
      ],
      show: true,
      visible: false
    }
  }
}
</script>

<style scoped>
  .containerB {
    width: 1100px;
    height: 800px;
    overflow-y: auto;
    -ms-overflow-style: none;
    overflow: -moz-scrollbars-none;
    -webkit-perspective: 1px;
    perspective: 1px;
    -webkit-transform-style: preserve-3d;
    transform-style: preserve-3d;
    -moz-box-shadow:2px 2px 12px #FFF5FA; -webkit-box-shadow:2px 2px 12px #FFF5FA; box-shadow:2px 2px 12px #FFF5FA;
    -moz-border-radius:2em; -webkit-border-radius:2em; border-radius:2em;
  }

  .containerB::-webkit-scrollbar {
    display: none;
  }
.main-section{
  display: flex;
  flex-direction: row;
  background-color: rgba(255, 255, 255, 0.938);
  height: 200vh;
  position: relative;
  -moz-box-shadow:2px 2px 12px #FFF5FA; -webkit-box-shadow:2px 2px 12px #FFF5FA; box-shadow:2px 2px 12px #FFF5FA;
  -moz-border-radius:2em; -webkit-border-radius:2em; border-radius:2em;
  padding: 10px;
}

.tab-content {
position: absolute;
top: 0;
right: 0;
width: calc(100% - 200px);
height: 100%;
overflow: hidden;
}

.tab-content section {
position: absolute;
width: 100%;
height: 100%;
display: none;
}

header {
box-sizing: border-box;
min-height: 15vh;
padding: 5vw 0 0vw;
position: relative;
-webkit-transform-style: inherit;
transform-style: inherit;
width: auto;
text-align:right;
}
header, header:before {
background: 50% 50% / cover;
}
header::before {
bottom: 0;
content: "";
left: 0;
position: absolute;
right: 0;
top: 0;
display: block;
background-color: rgba(247, 248, 247, 0.37);
background-size: cover;
-webkit-transform-origin: center center 0;
-webkit-transform: translateZ(-1px) scale(2);
transform-origin: center center 0;
transform: translateZ(-1px) scale(2);
z-index: -1;
min-height: 100vh;
min-width: 100vw;
}

.clear-backend{
  position: relative;
  display: flex;
  flex-direction: column;
  align-items: center;
}

.tab-content{
  position: relative;
  top: 20px;
  left: 5px;
}
.avatar{
  text-align: center;
}
.menu {
  margin-top: 30px;
}
.el-menu-item{
float: right;
margin: 10px 30px;
background-color: transparent;
font-weight: bold;
font-size: 18px;
text-shadow: 0 1px 0 rgb(253, 250, 251),
0 0 5px rgba(0, 0, 0, 0),
0 1px 3px rgba(255, 221, 221, 0.2);
border-radius:2em;
}
.el-menu-item.is-active {
background-color: rgba(248, 116, 145, 0.534) !important;
}
</style>
