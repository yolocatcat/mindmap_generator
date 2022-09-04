<template>
  <div class="containerC">
    <div style="height:50px;margin-left:43%;padding-top:30px;border-bottom: #efefef solid 1px;">
      <el-radio-group v-model="currentCase" size="small"
        @change="$router.replace('/start')">
        <el-radio-button label="原始文本"></el-radio-button>
        <el-radio-button label="思维导图"></el-radio-button>
      </el-radio-group>
    </div>
    <div id="html2canvas" ref="html2canvas">
    <svg id="markmap" style="height:calc(80vh - 10px);width:calc(80vw - 10px);background-color: aliceblue;"></svg>
    </div>
    <div class="down">
      <el-tooltip  content="导出图片" placement="right" effect="light">
        <el-button circle type="primary" @click="saveImage('html2canvas', 'mindmap')" icon="el-icon-download" style="border: 1.2px solid;">保存图片</el-button>
      </el-tooltip>
    </div>
  </div>
</template>

<script>
import { Transformer } from 'markmap-lib'
import * as markmap from 'markmap-view'
import html2canvas from 'html2canvas'

export default {
  name: 'Markmap',
  data () {
    return {
      markmap: markmap,
      value: '',
      currentCase: '思维导图'
    }
  },
  created () {
    // 获取源数据
    let value = sessionStorage.getItem('value')
    this.value = value
  },
  mounted () {
    this.mapView()
  },
  methods: {
    mapView () {
      const transformer = new Transformer()
      const { root } = transformer.transform(this.value)
      const { Markmap } = this.markmap
      Markmap.create('#markmap', undefined, root)
    },
    dataURLToBlob (dataurl) {
      let arr = dataurl.split(',')
      let mime = arr[0].match(/:(.*?);/)[1]
      let bstr = atob(arr[1])
      let n = bstr.length
      let u8arr = new Uint8Array(n)
      while (n--) {
        u8arr[n] = bstr.charCodeAt(n)
      }
      return new Blob([u8arr], { type: mime })
    },
    saveImage (divText, imgText) {
      let canvasID = this.$refs[divText]
      let that = this
      let a = document.createElement('a')
      html2canvas(canvasID).then(canvas => {
        let dom = document.body.appendChild(canvas)
        dom.style.display = 'none'
        a.style.display = 'none'
        document.body.removeChild(dom)
        let blob = that.dataURLToBlob(dom.toDataURL('image/png'))
        a.setAttribute('href', URL.createObjectURL(blob))
        // 这块是保存图片操作 可以设置保存的图片的信息
        a.setAttribute('download', imgText + '.png')
        document.body.appendChild(a)
        a.click()
        URL.revokeObjectURL(blob)
        document.body.removeChild(a)
      })
    }

  }
}
</script>
<style scoped>
.containerC {
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

.containerC::-webkit-scrollbar {
display: none;
}
.down{
position: absolute;
right:15%;
top: 3%;
}
</style>
