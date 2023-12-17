package com.chatapp.services

import com.chatapp.dto.CreateUserRequest
import com.chatapp.models.Message
import com.chatapp.models.User
import com.chatapp.repositories.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class UserService {

    @Autowired
    lateinit var userRepository: UserRepository


    fun getAllEmployees(): MutableList<User> {
        return userRepository.findAll()
    }

    fun saveUser(user: CreateUserRequest): User {
        val newUser = User(
                username = user.username,
                email = user.email,
                picture = user.picture
        )
        return userRepository.save(newUser)
    }


}