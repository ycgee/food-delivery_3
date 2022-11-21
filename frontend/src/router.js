
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import OrderManager from "./components/listers/OrderCards"
import OrderDetail from "./components/listers/OrderDetail"
import PaymentManager from "./components/listers/PaymentCards"
import PaymentDetail from "./components/listers/PaymentDetail"

import FoodCookingManager from "./components/listers/FoodCookingCards"
import FoodCookingDetail from "./components/listers/FoodCookingDetail"

import DeliveryManager from "./components/listers/DeliveryCards"
import DeliveryDetail from "./components/listers/DeliveryDetail"

import MessageManager from "./components/listers/MessageCards"
import MessageDetail from "./components/listers/MessageDetail"

import MyPageView from "./components/MyPageView"
import MyPageViewDetail from "./components/MyPageViewDetail"

export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/orders',
                name: 'OrderManager',
                component: OrderManager
            },
            {
                path: '/orders/:id',
                name: 'OrderDetail',
                component: OrderDetail
            },
            {
                path: '/payments',
                name: 'PaymentManager',
                component: PaymentManager
            },
            {
                path: '/payments/:id',
                name: 'PaymentDetail',
                component: PaymentDetail
            },

            {
                path: '/foodCookings',
                name: 'FoodCookingManager',
                component: FoodCookingManager
            },
            {
                path: '/foodCookings/:id',
                name: 'FoodCookingDetail',
                component: FoodCookingDetail
            },

            {
                path: '/deliveries',
                name: 'DeliveryManager',
                component: DeliveryManager
            },
            {
                path: '/deliveries/:id',
                name: 'DeliveryDetail',
                component: DeliveryDetail
            },

            {
                path: '/messages',
                name: 'MessageManager',
                component: MessageManager
            },
            {
                path: '/messages/:id',
                name: 'MessageDetail',
                component: MessageDetail
            },

            {
                path: '/myPages',
                name: 'MyPageView',
                component: MyPageView
            },
            {
                path: '/myPages/:id',
                name: 'MyPageViewDetail',
                component: MyPageViewDetail
            },


    ]
})
