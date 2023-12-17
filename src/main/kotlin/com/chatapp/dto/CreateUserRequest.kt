package com.chatapp.dto

data class CreateUserRequest (
        var username: String,
        var email: String,
        var picture: String,
)