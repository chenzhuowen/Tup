import axios from 'axios'
import qs from 'qs'

export const instance = axios.create({

    timeout: 1000 * 10
})

instance.interceptors.request.use(config => {
    return config;
}, error => {
    return Promise.error(error);
}
)

instance.interceptors.response.use(function (response) {
    return response;
})

export const get = (url, params) => {
    return instance.get(url, { params: params });
}

export const post = (url, data) => {
    data = qs.stringify(data);
    return instance.post(url, data);
}
