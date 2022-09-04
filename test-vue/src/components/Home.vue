<template>
  <el-container class="page">
    <el-header class="navmenu">
      <nav-menu></nav-menu>
    </el-header>
    <el-main class="context">
        <router-view></router-view>
    </el-main>
  </el-container>
</template>

<script>
import NavMenu from './common/NavMenu.vue'

export default {
  name: 'Home',
  components: { NavMenu }
}
</script>

<style scoped>
.page{
  height: 100vh;
  background-color: transparent;
  scroll-snap-type: y mandatory;
  overflow-x:hidden;
  overflow-y: auto;
  -ms-overflow-style: none;
  overflow: -moz-scrollbars-none;
}
.page::-webkit-scrollbar {
display: none;
}
.navmenu{
  margin: 0;
}

.context{
  display: flex;
  justify-content:center;
  align-items: center;
  position: relative;
  overflow-x: hidden;
  overflow-y: auto;
  height: 100vh;
  scroll-snap-align: start;
}
::-webkit-scrollbar {
display: none;
}
</style>
