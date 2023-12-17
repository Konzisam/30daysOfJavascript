package com.chatapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class ChatappApplication

fun main(args: Array<String>) {
	runApplication<ChatappApplication>(*args)
}
//@RestController
//class MessageResource(){
//
//	@GetMapping
//	fun index(): String{
//		return "check!"
//	}
//
//	@GetMapping("message")
//	fun getMessage(): Message{
//		return Message(1, "Our first message")
//	}
//	@GetMapping("messages")
//	fun getMListOfMessage(): List<Message>{
//		return listOf(
//				Message(2,"Test again"),
//				Message(3,"Test again and again"),
//				Message(4,"Test again and again and again"),
//				Message(5,"Test again and again and again and again"),
//		)
//	}
//}

data class Message(val id: Long, val text: String)