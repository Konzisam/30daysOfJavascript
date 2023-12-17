package com.chatapp.models

import jakarta.persistence.*
import java.util.Date

@Entity
@Table(name = "messages")
data class Message (
    @Id
    @GeneratedValue
    var id: Long = -1,
    var value: String,
    var time: Date,
){

    @ManyToOne
    open lateinit var chatroom: Chatroom

    @ManyToOne
    open lateinit var user: User
}