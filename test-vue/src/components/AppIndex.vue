<template>
  <div class="main-container">
      <section class="cd-intro">
        <div class="cd-intro-content bouncy">
          <h1>Mindmap-Generator</h1>
          <p>可用于日常工作与学习生活，比如读书笔记、知识点梳理等</p>
          <div class="action-wrapper">
            <a class="cd-btn main-action"></a>
            <el-button round @click="start" class="cd-btn" style="font-size: 25px;">start now</el-button>
          </div>
        </div>
      </section>
    <div class="wrap">
      <div class="tile">
        <img src="@/assets/b1-1.jpg" />
        <div class="text">
          <h1>一键生成脑图</h1>
          <h2 class="animate-text">文本大纲转思维导图</h2>
          <p class="animate-text">
            根据大纲笔记生成思维导图
            <br>导出图片并保存
            <br>简单、高效又快捷
          </p>
          <div class="dots">
            <span></span>
            <span></span>
            <span></span>
          </div>
        </div>
      </div>
      <div class="tile">
        <img src="@/assets/b1-3.jpg" />
        <div class="text">
          <h1>相关工具推荐</h1>
          <h2 class="animate-text">优质的实用思维工具汇总</h2>
          <p class="animate-text">
            功能强大的脑图工具推荐
            <br>相关资源汇总
          </p>
          <div class="dots">
            <span></span>
            <span></span>
            <span></span>
          </div>
        </div>
      </div>
      <div class="tile">
        <img src="@/assets/b1-4.jpg"/>
        <div class="text">
          <h1>管理历史记录</h1>
          <h2 class="animate-text">修改笔记并保存</h2>
          <p class="animate-text">
            记录您的编辑历史
            <br>修改、创作并保存
          </p>
          <div class="dots">
            <span></span>
            <span></span>
            <span></span>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default ({
  name: 'AppIndex',
  methods: {
    start () {
      this.$router.replace('/start')
    }
  }
})

</script>

<style scoped>
  .main-container {
    height: 100vh;
    background-color: transparent;
    width: 1100px;
    -ms-overflow-style: none;
    overflow: -moz-scrollbars-none;
  }

  .wrap {
    margin: 35px auto;
    padding-top:50px;
    width: 100%;
    display: flex;
    align-items: space-around;
    max-width: 1200px;
    background-color: rgba(250, 246, 246, 0.726);
    -moz-border-radius: 2em;
    -webkit-border-radius: 2em;
    border-radius: 2em;
    box-shadow: 2px 2px 12px rgba(252, 247, 247, 0.74);
  }

  .tile {
    width: 380px;
    height: 380px;
    margin: 10px;
    background-color: #f898bdb2;
    display: inline-block;
    background-size: cover;
    position: relative;
    cursor: pointer;
    transition: all 0.4s ease-out;
    box-shadow: 0px 35px 77px -17px rgba(104, 103, 103, 0.466);
    overflow: hidden;
    color: rgb(250, 246, 246);
    font-family: 'Microsoft YaHei', sans-serif;
    border-radius: 30px;
  }

  .tile img {
    height: 100%;
    width: 100%;
    position: absolute;
    top: 0;
    left: 0;
    z-index: 0;
    transition: all 0.4s ease-out;
  }

  .tile .text {
    z-index: 99;
    position: absolute;
    padding: 30px;
    height: calc(100% - 50px);
    font-weight: solid;
  }

  .tile h1 {
    font-weight: 300 solid;
    margin: 0;
   text-shadow:1px 1px rgb(248, 176, 192),-1px -1px rgb(250, 208, 208),1px -1px rgb(255, 237, 237),-1px 1px rgb(247,
   185, 185);
  }

  .tile h2 {
    font-weight: 200;
    margin: 20px 0 0 0;
    font-style: italic;
    transform: translateX(200px);
    text-shadow:0 .03em .03em rgba(255, 115, 115, 0.527);
  }

  .tile p {
    font-weight: 300 solid;
    margin: 20px 0 0 0;
    line-height: 25px;
    transform: translateX(-200px);
    transition-delay: 0.2s;
  }

  .animate-text {
    opacity: 0;
    transition: all 0.6s ease-in-out;
    text-shadow:1px 1px rgb(248, 176, 192),-1px -1px rgb(250, 208, 208),1px -1px rgb(255, 237, 237),-1px 1px rgb(247,
    185, 185);
  }

  .tile:hover {
    box-shadow: 0px 35px 77px -17px rgba(0, 0, 0, 0.64);
    transform: scale(1.05);
  }

  .tile:hover img {
    opacity: 0.2;
  }

  .tile:hover .animate-text {
    transform: translateX(0);
    opacity: 1;
  }

  .cd-intro {
    font-family: "Helvetica Neue",Helvetica,"PingFang SC","Hiragino Sans GB","Microsoft YaHei","微软雅黑",Arial,sans-serif;
    position: relative;
    display: block;
    font-size: 30px;
    color: #ffffff00;
    text-shadow: 5px 5px 0px #f7bbbe;
    font-weight: bold;
    text-align: center;
    background: #46b2fa2a;
    padding: 20px;
    top: 25%;
    left: 50%;
    transform: translate(-50%, -50%);
    -moz-border-radius: 1.5em;
    -webkit-border-radius: 1.5em;
    border-radius: 1.5em;
    -moz-box-shadow:2px 2px 12px #4f6ab6a9; -webkit-box-shadow:2px 2px 12px #4f6ab6a9; box-shadow:2px 2px 12px
    #4386dfa9;
  }

  .cd-intro-content h1,
  .cd-intro-content p {
    opacity: 0;
    animation-delay: 0.3s;
    animation-fill-mode: forwards;
    margin-left: 10px;
    color:rgb(244, 245, 240);
  }
  .cd-intro-content .cd-btn {
  opacity: 0;
  animation-delay: 0.3s;
  animation-fill-mode: forwards;
  margin-left: 10px;
  background:rgba(254, 254, 255, 0.705);
  color:rgb(255, 248, 251);
  font-weight: solid;
  text-shadow:1px 1px rgb(248, 176, 192),-1px -1px rgb(250, 208, 208),1px -1px rgb(255, 237, 237),-1px 1px rgb(247, 185, 185);
  }

  .bouncy.cd-intro-content h1 {
    animation-name: cd-bounce-right;
  }

  .bouncy.cd-intro-content p {
    animation-name: cd-bounce-left;
  }

  .bouncy.cd-intro-content h1,
  .bouncy.cd-intro-content p {
    animation-duration: 0.6s;
  }

  .bouncy.cd-intro-content .cd-btn {
    animation-name: cd-bounce-rotate;
    animation-duration: 0.5s;
  }
  .bouncy.cd-intro-content .cd-btn.main-action {
    animation-delay: 0.4s;
  }

  @keyframes cd-bounce-right {
    0% {
      opacity: .2;
      transform: translateX(-200px);
    }

    60% {
      opacity: .7;
      transform: translateX(15px);
    }

    100% {
      opacity: 1;
      transform: translateX(0);
    }
  }

  @keyframes cd-bounce-left {
    0% {
      opacity: .2;
      transform: translateX(200px);
    }

    60% {
      opacity: .7;
      transform: translateX(-15px);
    }

    100% {
      opacity: 1;
      transform: translateX(0);
    }
  }

  @keyframes cd-bounce-rotate {
    0% {
      opacity: .2;
      transform: perspective(800px) rotateX(-80deg);
    }

    20% {
      opacity: 1;
    }

    60% {
      transform: perspective(800px) rotateX(20deg);
    }

    100% {
      opacity: 1;
      transform: perspective(800px) rotateX(0);
    }
  }

  .cd-intro-content h1,
  .cd-intro-content p,
  .cd-intro-content .cd-btn {
    opacity: 0;
    animation-delay: 0.3s;
    animation-fill-mode: forwards;
    text-decoration: none;
  }

  .bouncy.cd-intro-content h1 {
    animation-name: cd-bounce-right;
  }

  .bouncy.cd-intro-content p {
    animation-name: cd-bounce-left;
  }

  .bouncy.cd-intro-content h1,
  .bouncy.cd-intro-content p {
    animation-duration: 0.6s;
  }

  .bouncy.cd-intro-content .cd-btn {
    animation-name: cd-bounce-rotate;
    animation-duration: 0.5s;
  }

  .bouncy.cd-intro-content .cd-btn.main-action {
    animation-delay: 0.4s;
  }

  @keyframes cd-bounce-right {
    0% {
      opacity: .2;
      transform: translateX(-200px);
    }

    60% {
      opacity: .7;
      transform: translateX(15px);
    }

    100% {
      opacity: 1;
      transform: translateX(0);
    }
  }

  @keyframes cd-bounce-left {
    0% {
      opacity: .2;
      transform: translateX(200px);
    }

    60% {
      opacity: .7;
      transform: translateX(-15px);
    }

    100% {
      opacity: 1;
      transform: translateX(0);
    }
  }

  @keyframes cd-bounce-rotate {
    0% {
      opacity: .2;
      transform: perspective(800px) rotateX(-80deg);
    }

    20% {
      opacity: 1;
    }

    60% {
      transform: perspective(800px) rotateX(20deg);
    }

    100% {
      opacity: 1;
      transform: perspective(800px) rotateX(0);
    }
  }
</style>
