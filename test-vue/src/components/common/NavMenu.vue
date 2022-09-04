<template>
  <div class="top">
    <el-menu
      :default-active="this.$route.path"
      router
      mode="horizontal"
      background-color="transparent" text-color="white" active-text-color="white">

    <el-menu-item v-for="(item,i) in navList" :key="i" :index="item.name">
          {{ item.navItem }}
    </el-menu-item><span style="position: absolute; padding-top: 18px; right: 77%; font-size: 30px; font-weight: bold;color:rgb(252, 247, 247);text-shadow:0 0 .1em,0 0 .3em;" >MindMap--Generator</span>
    </el-menu>
  </div>
</template>

<script>
export default {
  data () {
    return {
      navList: [
        {name: '/admin', navItem: '个人中心'},
        {name: '/recommend', navItem: '推荐'},
        {name: '/start', navItem: '开始'},
        {name: '/index', navItem: '首页'}
      ]
    }
  }
}
</script>

<style scoped>
.top{
  background-color: transparent;
  height: 55px;
}
.top .el-menu--horizontal>.el-menu-item {
height: 55px;
line-height: 55px;
}
.el-menu-item{
  float: right;
  border-color: c;
  margin: 0px 30px;
  background-color: transparent;
  font-weight: bold;
  font-size: 18px;
  text-shadow: 0 1px 0 rgb(207, 201, 202),
  0 0 5px rgba(0, 0, 0, 0),
  0 1px 3px rgba(255, 221, 221, 0.2);
}
.el-menu-item.is-active {
background-color: #ffd1e0 !important;
}
a{
  text-decoration: none;
}

span {
  pointer-events: none;
  font: 900 120px/1 'Source Sans Pro', Arial, sans-serif;
  background: transparent;
  text-transform: uppercase;
  color: #fff;
  text-align: center; letter-spacing: -3px; padding-top: 10%;
  text-shadow: 0 1px 0 rgb(207, 201, 202),
  0 2px 0 rgb(194, 188, 189),

  0 0 5px rgba(0, 0, 0, 0),
  0 1px 3px rgba(255, 221, 221, 0.2),
  0 3px 5px rgba(206, 170, 170, 0.2),
  0 20px 20px rgba(240, 207, 207, 0.144);
}
</style>
