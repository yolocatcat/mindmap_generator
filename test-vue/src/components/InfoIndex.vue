<template>
  <div class="containerA">
    <div class="nav">
      <nav>
        <ul id="ul-header">
          <li> <a @click="scroll('part1')">一、思维导图工具</a> </li>
          <li> <a @click="scroll('part2')">&nbsp;&nbsp; （一）完全免费</a> </li>
          <li> <a @click="scroll('part3')">&nbsp;&nbsp; （二）专业版收费</a> </li>
          <li> <a @click="scroll('part4')">二、软件下载资源</a> </li>
        </ul>
      </nav>
      <section id="part1">
        <div class='content'>
          <h2>思维导图工具</h2>
        </div>
      </section>
      <section id="part2">
        <div class='content'>
          <h1>一、完全免费：</h1>
          <h4>1. draw.io</h4>（在线版&下载版&插件版 | 全平台）
          <p>
            Pros：（1）开源的绘制流程图的工具，拥有大量免费素材和模板；
            <br>（2）支持多国语言，可以导出到多种网盘或本地，在免费程序里算是相当不错的。
            <br>官网：<a href="https://app.diagrams.net">https://app.diagrams.net</a>
            <br>免安装单文件版：<a href="https://www.yuque.com/docs/share/7e348dff-2bd4-4d69-b513-dd2876951205">点此去下载</a>
          </p>
          <h4>2. 爱莫脑图</h4>（在线版&下载版 | 全平台）
          <p>
            Pros：（1）维导图一键生成，云端存储；
            <br>（2）团队协作，轻松构建结构化思维，一键分享。
            <br>官网：<a href="https://airmore.cn/online-mindmap">https://airmore.cn/online-mindmap</a>
          </p>
          <h4>3. MindLine</h4>（在线版&下载版 | 全平台）
          <p>
            Pros：（1）极简设计，没有繁琐的操作和复杂的界面；
            <br>（2）导出为图片和文字大纲等多种格式，并能随时分享给好友。
            <br>官网：<a href="http://www.mindline.cn">http://www.mindline.cn</a>
          </p>
          <h4>4. Wridea</h4>（在线版）
          <p>
            Pros：（1）免费提供让你搜集和管理各种想法服务的网站；
            <br>（2）和好友交流想法和创意。
            <br>官网：<a href="https://wridea.com">https://wridea.com</a>
          </p>
          <h4>5. GitMind</h4>（在线版&下载版 | 全平台）
          <p>
            Pros：（1）完全免费；
            <br>（2）设计简约美观，许多免费模板资源；
            <br>（3）可任意创建思维导图、流程图、组织结构图、UML图、泳道图和分析图等，支持多元素、多格式、多视图；
            <br>（4）支持多人协作，跨平台。
            <br>官网：<a href="https://gitmind.cn">https://gitmind.cn</a>
          </p>
          <h4>6. Mind42</h4>（在线版）
          <p>
            Pros：（1）简单易上手，操作快捷方便；
            <br>（2）支持私密保持和线上公布；
            <br>（3）协同合作功能。
            <br>官网：<a href="https://mind42.com">https://mind42.com</a>
          </p>
          <h4>7. Text 2 Mind Map</h4>（在线版）
          <p>
            Pros：（1）可以把文字大纲转换为思维导图；
            <br>（2）使你的项目看上去更加视觉化和直观化。
            <br>Cons：（1）功能较少。
            <br>官网：<a href="https://www.text2mm.com">https://www.text2mm.com</a>
          </p>
          <h4>8. FreeMind</h4> （下载版）
          <p>
            Pros：（1）导出Flash和HTML格式出色；
            <br>（2）FreeMind 可以导入目录结构；
            <br>（3）简约，占用资源少，启动运行速度快。
            <br>Cons：（1）界面比较过时；
            <br>（2）功能较少，与MS及其他无整合。
            <br>下载指路：
            <a href="http://freemind.sourceforge.net/wiki/index.php/Main_Page">http://freemind.sourceforge.net</a>
          </p>
          <h4>9. 百度脑图</h4> （在线版）
          <p>
            Pros：（1）直观、形象、易于理解和梳理；
            <br>（2）简单易用，云存储，易分享。
            <br>官网：<a href="https://naotu.baidu.com">https://naotu.baidu.com</a>
          </p>
        </div>
      </section>
<el-divider></el-divider>
      <section id="part3">
        <div class='content'>
          <h1>（二）专业版需收费（也有免费版，但功能不齐全）：</h1>
          <h4>1. Coggle</h4>
          <p>Pros：（1）UI设计简约漂亮；
            <br>（2）支持多人协作，无需登录匿名协作；
            <br>（3）图库模板丰富，可制作流程图；
            <br>（4）可以拖拽桌面上的图片到笔记中，操作简单，可无限上传。
            <br>Cons：（1）仅支持Google登录；
            <br>（2）专业团队功能需要收费。
            <br>官网：<a href="https://coggle.it">https://coggle.it</a>
          </p>
          <h1>同样功能强大、设计美观的有：</h1>
          <h4>2. MindManage</h4>（可下载）
          <p>Pros：（1）与Microsoft软件无缝集成，可快速地将数据导入或导出到Microsoft Word， PowerPoint， Excel， Outlook， Project 和 Visio中，十分方便。
            <br>官网：<a href="http://www.mindmanager.cn">http://www.mindmanager.cn</a>
          </p>
          <h4>3. Mindomo</h4>（可下载）
          <p>Pros：（1）网上同步及储存功能；
            <br>（2）可将思维导图转成简报来演示工作，可汇入及导出思维导图至以下格式：MindManager， Freemind， Mindmeister， XMind， Bubbl.us， PDF， Word，
            PowerPoint， Text， OPML， MPX， HTML， ZIP， PNG， XLS。
            <br>官网：<a href="https://www.mindomo.com">https://www.mindomo.com</a>
          </p>
          <h4>4. MindNode</h4>（可下载、APP同步）
          <p>Pros：（1）支持iOS设备上VGA输出。
            <br>官网：<a href="https://mindnode.com">https://mindnode.com</a>
          </p>
          <h4>5. MindMeister</h4>(包括iOS、安卓端)
          <p>Pros：（1）与在线任务和项目管理应用MeisterTask 无缝结合
            <br>官网：<a href="https://www.mindmeister.com/zh">https://www.mindmeister.com/zh</a>
          </p>
          <h4>6. Stormboard</h4>
          <p>Pros：（1）基于Web的思维导图应用，可以跨设备使用；
            <br>（2）导出Word，PowerPoint或Excel报告以用作会议记录，适合企业团队使用。
            <br>官网：<a href="https://www.stormboard.com">https://www.stormboard.com</a>
          </p>
          <h4>7. MindMaster</h4>
          <p>Pros：（1）跨平台，功能丰富，免费版也好用
            <br>官网：<a href="https://www.edrawsoft.cn/mindmaster/">https://www.edrawsoft.cn/mindmaster/</a>
          </p>
          <h4>8. 迅捷思维导图</h4>
          <p>Cons：（1）导出功能收费。
            <br>官网：<a href="http://www.siweidaotu.com">http://www.siweidaotu.com</a>
          </p>
          <h4>9. XMind</h4>（多平台可下载的软件）
          <p>Pros：（1）全功能的思维导图和头脑风暴软件。
            <br>官网：<a href="https://www.xmind.cn">https://www.xmind.cn</a>（提供下载，非在线版）
          </p>
          <h4>10. IMindMap</h4>（可下载）
          <p>Pros：（1）手绘风格，可以绘制思维导图、鱼骨图、二维图、树形图、逻辑图、组织结构图等；
            <br>（2）多图模式MultiMaps
            <br>官网：<a href="http://www.imindmap.cc">http://www.imindmap.cc</a>
          </p>
          <h4>11. Bubbl.us</h4>
          <p>
            Pros：（1）基于Flash的简单的Web应用程序，可通过E-mail与朋友共享；
            <br>（2）支持在博客或个人网站中嵌入HTML树形图表。
            <br>官网：<a href="https://bubbl.us">https://bubbl.us</a>
          </p>
          <h4>12. ProcessOn</h4>（在线版）
          <p>Pros：（1）在线作图工具的聚合平台；
            <br>（2）海量的图形化知识资源。
            <br>Cons：（1）只有在线版。
            <br>官网：<a href="https://www.processon.com">https://www.processon.com</a>
          </p>
          <h4>13. 幕布</h4>（在线版、软件版）
          <p>Pros：（1）结合了大纲笔记和思维导图的头脑管理工具；
            <br>（2）可以保留样式复制粘贴到印象笔记、简书、微信公众号等第三方写作平台。
            <br>官网：<a href="https://mubu.com">https://mubu.com</a>
          </p>
        </div>
      </section>
 <el-divider></el-divider>
      <section id="part4">
        <div class='content'>
          <h2>相关资源分享</h2>
          <h3>软件下载</h3>
          <h4>1. Dia</h4>
          <p>
            <a href="https://www.yuque.com/docs/share/7e348dff-2bd4-4d69-b513-dd2876951205">点此去下载</a>
          </p>
        </div>
      </section>
  </div>
</div>
</template>

<script>

export default ({
  name: 'InfoIndex',
  methods: {
    scroll (des) {
      var id = des
      document.getElementById(id).scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})
    }
  }
})
</script>

<style>
  .containerA{
  height: 800px;
  background-color: rgba(255, 255, 255, 0.972);
  width: 1100px;
  overflow-y: auto;
  -ms-overflow-style: none;
  overflow: -moz-scrollbars-none;
  -moz-box-shadow:2px 2px 12px #FFF5FA; -webkit-box-shadow:2px 2px 12px #FFF5FA; box-shadow:2px 2px 12px #FFF5FA;
  -moz-border-radius:2em; -webkit-border-radius:2em; border-radius:2em;
  display: flex;
  }
  .container::-webkit-scrollbar {
  display: none;
  }
.nav{
padding: 0;
margin: 0;
}
section{
margin: 10px 0;
}
ul{
list-style:none;
padding: 0;
margin: 0;
}
li{
margin: 5px;
}
nav{
position: fixed;
right: 12%;
top:30%;
background: rgba(255, 255, 255, 0.781);
cursor: pointer;
padding: 10px;
border-radius: 10px;
box-shadow: 2px 2px 12px rgba(99, 98, 98, 0.74);
}
.content {
  padding-left:60px;
  padding-right:60px;
}
</style>
