const user = {
    state: {
        userName: '',
        password: ''
    },
    getters: {
        getUserName(state) {
            return state.userName;
        },
        getPassword(state) {
            return state.password;
        }
    },
    mutations: {
        setUserName(state, userName) {
            state.userName = userName;
        },
        setPassword(state, password) {
            state.password = password;
        }
    },
    actions: {
        setUserName(context) {
            setTimeout(() => context.commit('setUserName'), 1000);
        },
        setPassword(context) {
            setTimeout(() => context.commit('setPassword'), 1000);
        }
    },
}

export default user;