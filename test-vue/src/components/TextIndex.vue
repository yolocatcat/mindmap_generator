<template>
<div class="container">
    <div style="height:50px;margin-left:43%;padding-top:30px;border-bottom: #efefef solid 1px;">
      <el-radio-group style="margin-left:auto;margin-right: auto;" v-model="currentCase" size="small"
        @change="change">
        <el-radio-button label="原始文本"></el-radio-button>
        <el-radio-button label="思维导图"></el-radio-button>
      </el-radio-group>
    </div>
    <div class="tip">
      <el-popover placement="right-end" width="200" trigger="click">
        <div>1.点击最上方工具栏中的“H”来创建多级标题； <br> 2.点击工具栏的最右侧“？”来获取语法帮助</div>
        <el-button slot="reference" type="primary" icon="el-icon-s-opportunity" circle>使用帮助</el-button>
      </el-popover>
    </div>
    <div style="margin-left:20px;margin-right:20px;height: calc(80vh - 10px);">
      <mavon-editor :toolbars="toolbars" v-model="value" ref="md" @save="saveMavon" style="height: 100%;width: 100%;"></mavon-editor>
    </div>

</div>

</template>

<script>

export default {
  name: 'TextIndex',
  data () {
    return {
      show: true,
      value: '',
      currentCase: '原始文本',
      toolbars: {
        bold: true, // 粗体
        italic: true, // 斜体
        header: true, // 标题
        underline: false, // 下划线
        strikethrough: true, // 中划线
        mark: false, // 标记
        quote: true, // 引用
        fullscreen: true, // 全屏编辑
        readmodel: true, // 沉浸式阅读
        htmlcode: false, // 展示html源码
        help: true, // 帮助
        /* 1.3.5 */
        undo: true, // 上一步
        redo: true, // 下一步
        trash: true, // 清空
        save: true, // 保存（触发events中的save事件）
        /* 1.4.2 */
        navigation: true, // 导航目录
        /* 2.1.8 */
        alignleft: false, // 左对齐
        aligncenter: false, // 居中
        alignright: false, // 右对齐
        /* 2.2.1 */
        subfield: true, // 单双栏模式
        preview: true // 预览
      }
    }
  },
  created () {
    // 获取源数据
    let value = sessionStorage.getItem('value')
    this.value = value
  },
  beforeDestroy () {
    sessionStorage.setItem('value', this.value)
  },
  methods: {
    getDate () {
      const myDate = new Date()
      // 获取当前年
      const year = myDate.getFullYear()
      // 获取当前月
      const month = myDate.getMonth() + 1
      // 获取当前日
      const date = myDate.getDate()
      // 获取当前小时数(0-23)
      const h = myDate.getHours()
      // 获取当前分钟数(0-59)
      const m = myDate.getMinutes()
      const s = myDate.getSeconds()

      // 获取当前时间
      const time =
        year +
        '-' +
        this.convert(month) +
        '-' +
        this.convert(date) +
        ' ' +
        this.convert(h) +
        ':' +
        this.convert(m) +
        ':' +
        this.convert(s)
      return time
    },
    // 日期时间处理
    convert (val) {
      return val < 10 ? '0' + val : val
    },
    postMd (value, username, time) {
      this.$axios
        .post('/start', {
          mdContent: value,
          username: username,
          time: time
        })
        .then(response => {
          console.log(response)
          this.$message({
            message: '保存成功',
            type: 'success'
          })
        })
        .catch(error => {
          console.log(error)
          this.$message.error('保存失败！请重试')
        })
    },
    saveMavon () {
      this.postMd(this.value, this.$store.getters.username, this.getDate())
      sessionStorage.setItem('value', this.value)
    },
    change () {
      sessionStorage.setItem('value', this.value)
      this.$router.replace('/mindmap')
    }
  }
}
</script>

<style scoped>
.container{
  height: 800px;
  background-color: rgb(255, 254, 254);
  width: 1100px;
  -moz-box-shadow:2px 2px 12px #FFF5FA; -webkit-box-shadow:2px 2px 12px #FFF5FA; box-shadow:2px 2px 12px #FFF5FA;
  -moz-border-radius:2em; -webkit-border-radius:2em; border-radius:2em;
}
.transition-box {
  margin-left:50px;
  margin-bottom: 50px;
  width: 100px;
  height: 20px;
  border-radius: 4px;
  background-color: transparent;
  text-align: left;
  color: rgba(119, 119, 119, 0.712);
  padding: 25px 20px;
  box-sizing: border-box;
  margin-right: 20px;
}
.text-input{
    background-color: transparent;
    border-style: none;
}
.tip{
  position: absolute;
  right:15%;
  top: 3%;
}
</style>
