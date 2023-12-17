package com.chatapp.controller

import com.chatapp.dto.MessageResponse
import com.chatapp.dto.NewChatRequest
import com.chatapp.models.Chatroom
import com.chatapp.models.Message
import com.chatapp.services.ChatService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("chat")
class ChatController {

    @Autowired
    lateinit var chatService: ChatService

    @PostMapping
    fun newChatMessage(@RequestBody newChat: NewChatRequest): Message {
        return chatService.newChatMessage(newChat)
    }

    @GetMapping("messages")
    fun getAllMessages(): List<MessageResponse> {

        var tempList = chatService.getAllMessages()
    return convertList(tempList)
    }

    fun convertList(List: MutableSet<Message>):List<MessageResponse> {

        var messageResponseList = listOf<MessageResponse>()
}
// Initial
//    @PostMapping
//    fun newChatMessage(@RequestBody newChat: NewChatRequest): Message {
//        return chatService.newChatMessage(newChat)
//    }

//    @PostMapping("saveChat")
//    fun saveChatroom(@RequestBody chatroom: NewChatRequest): Chatroom {
//        return chatService.saveChatroom(chatroom)
//    }

//    @GetMapping("chats")
//    fun getAllChats(): MutableList<Chatroom> {
//        return chatService.getAllChats()
//    }




}