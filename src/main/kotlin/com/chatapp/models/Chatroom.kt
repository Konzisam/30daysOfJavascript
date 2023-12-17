package com.chatapp.models

import jakarta.persistence.*

@Entity
@Table(name = "chatrooms")
class Chatroom(
        @Id
        @GeneratedValue
        var id: Long = -1,
        var name: String,
        var iconUrl: String,
){
        @ManyToMany
        open var users: List<User> = listOf()

        @OneToMany
        open var messages: List<Message> = listOf()
}