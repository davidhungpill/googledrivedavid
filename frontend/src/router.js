
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import DriveFileManager from "./components/listers/DriveFileCards"
import DriveFileDetail from "./components/listers/DriveFileDetail"

import IndexerFileIndexManager from "./components/listers/IndexerFileIndexCards"
import IndexerFileIndexDetail from "./components/listers/IndexerFileIndexDetail"

import VideoProcessingVideoStremingManager from "./components/listers/VideoProcessingVideoStremingCards"
import VideoProcessingVideoStremingDetail from "./components/listers/VideoProcessingVideoStremingDetail"

import NotificationMessageManager from "./components/listers/NotificationMessageCards"
import NotificationMessageDetail from "./components/listers/NotificationMessageDetail"



export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/drives/files',
                name: 'DriveFileManager',
                component: DriveFileManager
            },
            {
                path: '/drives/files/:id',
                name: 'DriveFileDetail',
                component: DriveFileDetail
            },

            {
                path: '/indexers/fileIndices',
                name: 'IndexerFileIndexManager',
                component: IndexerFileIndexManager
            },
            {
                path: '/indexers/fileIndices/:id',
                name: 'IndexerFileIndexDetail',
                component: IndexerFileIndexDetail
            },

            {
                path: '/videoProcessings/videoStremings',
                name: 'VideoProcessingVideoStremingManager',
                component: VideoProcessingVideoStremingManager
            },
            {
                path: '/videoProcessings/videoStremings/:id',
                name: 'VideoProcessingVideoStremingDetail',
                component: VideoProcessingVideoStremingDetail
            },

            {
                path: '/notifications/messages',
                name: 'NotificationMessageManager',
                component: NotificationMessageManager
            },
            {
                path: '/notifications/messages/:id',
                name: 'NotificationMessageDetail',
                component: NotificationMessageDetail
            },




    ]
})
