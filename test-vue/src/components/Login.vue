<template>
  <body id="poster">
    <el-form class="login-container" label-position="left" label-width="0px">
      <h3 class="login_title">用户登录</h3>
      <el-form-item>
        <el-input type="text" v-model="loginForm.username" auto-complete="off" placeholder="用户名"></el-input>
      </el-form-item>
      <el-form-item>
        <el-input type="password" v-model="loginForm.password" auto-complete="off" placeholder="密码"></el-input>
      </el-form-item>
      <el-form-item style="width: 100%">
        <el-button type="primary" style="width: 100%;border: none;" v-on:click="login">登录</el-button>
      </el-form-item>
      <el-form-item style="width: 100%">
        <el-button type="primary" style="width: 100%;border: none" v-on:click="toRegister">没有账号？去注册
        </el-button>
      </el-form-item>
    </el-form>
  </body>
</template>

<script>

export default {
  name: 'Login',
  data () {
    return {
      loginForm: {
        username: '',
        password: ''
      },
      responseResult: []
    }
  },
  methods: {
    login () {
      // 登录按钮的点击方法，即向后端 /login 接口发送数据，获得成功的响应后，页面跳转到 /index
      // eslint-disable-next-line no-unused-expressions
      var _this = this
      console.log(this.$store.state)
      this.$axios
        .post('/login', {
          username: this.loginForm.username,
          password: this.loginForm.password
        })
        .then(successResponse => {
          if (successResponse.data.code === 200) {
            // var data = this.loginForm
            _this.$message({
              message: '登录成功',
              type: 'success'
            })
            _this.$store.commit('login', _this.loginForm)
            var path = this.$route.query.redirect
            this.$router.replace({path: path === '/' || path === undefined ? '/index' : path})
          }
          if (successResponse.data.code === 400) {
            this.$alert('用户名或密码错误！', '登陆失败', {
              confirmButtonText: '再试一次'})
          }
        })
        .catch(failResponse => {
          console.log(failResponse)
        })
    },
    toRegister () {
      this.$router.replace('/register')
    }
  }
}
</script>

<style>
#poster {
  background-color: transparent;
  position: absolute;
  margin: 13% auto;
  margin-left: 35%;
}
.login-container {
  border-radius: 15px;
  background-clip: padding-box;
  margin: auto;
  width: 350px;
  padding: 35px 35px 15px 35px;
  background: #fff;
  border: 1px solid #eaeaea;
  box-shadow: 0 0 25px #cac6c6;
}
.login-title {
  margin: 0px auto 40px auto;
  text-align: center;
  color:mediumvioletred;
}
</style>
