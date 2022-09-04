<template>
  <transition name="el-zoom-in-bottom">
      <el-timeline>
        <el-timeline-item v-for="(item, i) in textInfo" :key="i" :timestamp="item.time" placement="top">
          <el-card>
            <h4>{{item.mdContent}}</h4>
            <p>{{item.username}} 提交于 {{item.time}}</p>
          </el-card>
          <el-button type="primary" icon="el-icon-edit" circle @click="edit(item.mdContent)"></el-button>
        </el-timeline-item>
      </el-timeline>
  </transition>
</template>

<script>

export default {
  name: 'HistoryIndex',
  data () {
    return {
      textInfo: [],
      show: true
    }
  },
  mounted () {
    setTimeout(() => {
      var _this = this
      this.$axios
        .post('/admin/history', {username: _this.$store.state.user.username})
        .then(res => {
          console.log(res)
          _this.textInfo = JSON.parse(JSON.stringify(res))
          console.log(JSON.stringify(_this.textInfo))
          _this.textInfo = _this.textInfo.data
        })
        .catch(res => {
          console.log(res)
        })
    }, 800)
  },
  methods: {
    edit (value) {
      sessionStorage.setItem('value', value)
      this.$router.replace('/start')
    }
  }

}
</script>
