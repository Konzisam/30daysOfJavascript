package com.chatapp.repositories

import com.chatapp.models.Chatroom
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository
import java.util.Optional


@Repository
interface ChatroomRepository: JpaRepository<Chatroom, Long>{

    @Query("SELECT c FROM Chatroom c WHERE c.name = :name")
    fun findByName(@Param("name") name: String): Optional<Chatroom>
}