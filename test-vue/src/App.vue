<template>
  <div id="app">
    <router-view />
  </div>
</template>

<script>
export default {
  name: 'App'
}

</script>

<style>
  #app {
    background: url("./assets/login_bg.jpg") no-repeat;
    background-position: center;
    height: 100%;
    width: 100%;
    margin: 0;
    padding: 0;
    background-size: cover;
    position: absolute;
    overflow: hidden;
    background-attachment: fixed;
    -ms-overflow-style: none;
  }

</style>
