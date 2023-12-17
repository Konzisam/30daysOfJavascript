package com.chatapp.dto

data class NewChatRequest(
        var chatroomName: String,
        var userId: Long,
        var message: String
)
