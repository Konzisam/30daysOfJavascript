package com.chatapp.controller

import com.chatapp.dto.CreateUserRequest
import com.chatapp.models.User
import com.chatapp.services.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("users")
class UserController {

    @Autowired
    lateinit var userService: UserService

    @GetMapping
    fun index(): MutableList<User> {
        return userService.getAllEmployees()
    }

    @PostMapping
    fun saveUser(@RequestBody user: CreateUserRequest): User {
        return userService.saveUser(user)
    }

}