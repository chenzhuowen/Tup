const routes = [
    {
        path: '/',
        component: () => import('@views/Index.vue'),
        children: [
            {
                path: '/',
                name: 'Home',
                component: () => import('@/views/Home.vue')
            },
            {
                path: '/About',
                name: 'About',
                component: () => import('@/views/About.vue')
            },
            {
                path: '/User',
                name: 'User',
                component: () => import('@views/User.vue')
            },
            {
                path: '/Time',
                name: 'Time',
                component: () => import('@views/Time.vue')
            }
        ]
    },
    {
        path: '/404',
        name: '404',
        component: () => import('@views/404.vue')
    },
    {
        path: '*',
        redirect: '/404'
    },

]

export default routes;