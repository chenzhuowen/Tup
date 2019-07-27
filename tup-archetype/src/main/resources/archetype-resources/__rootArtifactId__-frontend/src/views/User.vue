<template>
  <div class="User">
    <h1>This is an about page</h1>
    <div>
      <p style="display:inline">用户：</p>
      <input type="text" v-model="userName" />
    </div>
    <div>
      <p style="display:inline">密码：{{password}}</p>
    </div>
    <button @click="queryUser">查询用户</button>
    <div>
      <p>用户：{{$store.state.user.userName}}</p>
      <p>密码：{{$store.state.user.password}}</p>
    </div>
  </div>
</template>

<script>
import { getUserInfo } from "@api/user";

export default {
  data() {
    return {
      userName: "",
      password: ""
    };
  },
  methods: {
    queryUser() {
      if (this.userName != "") {
        getUserInfo(this.userName)
          .then(response => {
            this.userName = response.data.userName;
            this.password = response.data.password;
            this.$store.commit("setUserName", response.data.userName);
            this.$store.commit("setPassword", response.data.password);
          })
          .catch(error => {
            console.log(error);
          });
      }
    }
  }
};
</script>

