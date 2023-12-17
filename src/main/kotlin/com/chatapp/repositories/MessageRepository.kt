package com.chatapp.repositories

import com.chatapp.models.Message
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface MessageRepository: JpaRepository<Message,Long> {
}