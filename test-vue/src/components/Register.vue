<template>
  <body id="paper">
    <el-form :model="registerForm" :rules="rules" class="login-container" label-position="left" label-width="0px"
      v-loading="loading">
      <h3 class="login_title">新用户注册</h3>
      <el-form-item prop="username">
        <el-input type="text" v-model="registerForm.username" auto-complete="off" placeholder="账号"></el-input>
      </el-form-item>
      <el-form-item prop="password">
        <el-input type="password" v-model="registerForm.password" auto-complete="off" placeholder="密码"></el-input>
      </el-form-item>
      <el-form-item prop="passwordConfirm">
        <el-input type="password" v-model="registerForm.passwordConfirm" auto-complete="off" placeholder="确认密码">
        </el-input>
      </el-form-item>

      <el-form-item style="width: 100%">
        <el-button type="primary" style="width: 100%;border: none;" v-on:click="register">立即注册
        </el-button>
      </el-form-item>
      <el-form-item style="width: 100%">
        <el-button type="primary" style="width: 100%;border: none;" v-on:click="toLogin">返回
        </el-button>
      </el-form-item>
    </el-form>
  </body>
</template>

<script>
export default {
  name: 'Register',
  data () {
    return {
      rules: {
        username: [{
          required: true,
          message: '用户名不能为空',
          trigger: 'blur'
        }],
        password: [{
          required: true,
          message: '密码不能为空',
          trigger: 'blur'
        }],
        passwordConfirm: [{
          required: true,
          message: '请确认密码',
          trigger: 'blur'
        }]
      },
      checked: true,
      registerForm: {
        username: '',
        password: '',
        passwordConfirm: ''
      },
      loading: false
    }
  },
  methods: {
    register () {
      var _this = this
      if (this.registerForm.password !== this.registerForm.passwordConfirm) {
        this.$message({
          message: '两次输入的密码不一致!',
          type: 'error'
        })
        return
      }
      this.$axios
        .post('/register', {
          username: this.registerForm.username,
          password: this.registerForm.password
        })
        .then(successResponse => {
          if (successResponse.data.code === 200) {
            this.$alert('你现在可以登陆了！', '注册成功', {
              confirmButtonText: '返回登陆'
            })
            _this.$router.replace('/login')
          }
          if (successResponse.data.code === 400) {
            _this.$message({
              message: '该用户名已存在!',
              type: 'error'
            })
          }
        })
        .catch(error => {
          console.log(error)
        })
    },
    toLogin () {
      this.$router.replace('/login')
    }
  }
}

</script>

<style>
  #paper {
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
    overflow: hidden;
  }

  .login-title {
    margin: 0px auto 40px auto;
    text-align: center;
    color: mediumvioletred;
  }

</style>
