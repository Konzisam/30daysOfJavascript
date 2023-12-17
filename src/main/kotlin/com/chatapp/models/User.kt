package com.chatapp.models

import jakarta.persistence.*


@Entity
@Table(name = "users")
data class User(
        @Id
        @GeneratedValue
    var id: Long = -1,
    var username: String,
    var email: String,
    var picture: String,
        ){

    @ManyToMany
    open var chatrooms: List<Chatroom> = listOf()

//    @OneToMany
//    open var messages: List<Message> = listOf()

}