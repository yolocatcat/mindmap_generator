<template>
  <div class="containerD">
    <el-page-header @back="goBack" content=" 创作思维导图并保存"
      style="height:30px;margin-left:3%;padding-top:30px;border-bottom: #efefef solid 1px;">
    </el-page-header>
    <div style="margin-top: 20px;margin-left:20px;margin-right:20px;">
      <mindmap v-model="data" style="height: calc(80vh - 10px);"></mindmap>
    </div>

  </div>
</template>
<script>
import mindmap from '@hellowuxin/mindmap'
export default {
  name: 'EditMap',
  components: { mindmap },
  methods: {
    goBack () {
      this.$router.replace('start')
    }
  },
  data: () => ({
    data: [{
      'name': '如何学习D3',
      'children': [
        {
          'name': '预备知识',
          'children': [
            { 'name': 'HTML & CSS' },
            { 'name': 'JavaScript' }
          ]
        },
        {
          'name': '安装',
          '_children': [
            { 'name': '折叠节点' }
          ]
        },
        {
          'name': '进阶',
          'left': true
        }
      ]
    }]
  })
}
</script>
<style>
.containerD {
height: 800px;
background-color: rgb(255, 254, 254);
width: 1100px;
overflow-x: hidden;
overflow-y: auto;
-ms-overflow-style: none;
overflow: -moz-scrollbars-none;
-moz-box-shadow: 2px 2px 12px #FFF5FA;
-webkit-box-shadow: 2px 2px 12px #FFF5FA;
box-shadow: 2px 2px 12px #FFF5FA;
-moz-border-radius: 2em;
-webkit-border-radius: 2em;
border-radius: 2em;
}

.containerD::-webkit-scrollbar {
display: none;
}
</style>
