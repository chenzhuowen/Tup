const path = require('path')
const resolve = (dir) => path.join(__dirname, dir);

module.exports = {
    publicPath: process.env.NODE_ENV === 'production' ? './' : '/',
    chainWebpack: config => {
        config.resolve.alias
            .set('@', resolve('src'))
            .set('@api', resolve('src/api'))
            .set('@assets', resolve('src/assets'))
            .set('@components', resolve('src/components'))
            .set('@lib', resolve('src/lib'))
            .set('@util', resolve('src/util'))
            .set('@views', resolve('src/views'));
    },
    devServer: {
        port: 8082,
        proxy: {
            '/api': {
                target: "http://localhost:8080"
            }
        }
    }
};