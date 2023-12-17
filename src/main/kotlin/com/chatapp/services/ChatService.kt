package com.chatapp.services

import com.chatapp.dto.NewChatRequest
import com.chatapp.models.Chatroom
import com.chatapp.models.Message
import com.chatapp.models.User
import com.chatapp.repositories.ChatroomRepository
import com.chatapp.repositories.MessageRepository
import com.chatapp.repositories.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class ChatService {

    @Autowired
    lateinit var userRepository: UserRepository

    @Autowired
    lateinit var messageRepository: MessageRepository

    @Autowired
    lateinit var chatroomRepository: ChatroomRepository

    fun newChatMessage(newChat: NewChatRequest): Message {
        var newMessage = Message(
                value = newChat.message,
                time = Date())

        // Does the chat room exist
        var chatroom = chatroomRepository.findByName(newChat.chatroomName)

        if (chatroom.isPresent) {
            newMessage.chatroom = chatroom.get()
        } else {
            val newChatroom = chatroomRepository.save(
                    Chatroom(name = newChat.chatroomName,
                            iconUrl = "default.png")
            )
            newMessage.chatroom = newChatroom
        }

        // Does the User exist
        var temp: Optional<User> = userRepository.findById(newChat.userId)

        if (temp.isPresent) {
            newMessage.user = temp.get()
        } else {
            // Throw Error
        }
        // Save Message
        return messageRepository.save(newMessage)
    }

        fun getAllMessages(): MutableList<Message> {

            return messageRepository.findAll()
        }

//        fun getAllChats(): MutableList<Chatroom> {
//
//            return chatroomRepository.findAll()
//        }

//        fun saveChatroom(chatroom: NewChatRequest): Chatroom {
//            val newChatroom = Chatroom(
//                    name = chatroom.chatroomName,
//                    userId = chatroom.userId,
//                    iconUrl = "default.png"
//            )
//            return chatroomRepository.save(newChatroom)
//        }


    }

