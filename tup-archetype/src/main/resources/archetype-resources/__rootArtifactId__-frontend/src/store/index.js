import Vue from 'vue'
import Vuex from 'vuex'
import user from './module/user.js'

Vue.use(Vuex)

const instance = new Vuex.Store({
    modules: {
        user: user
    }
})

export default instance;