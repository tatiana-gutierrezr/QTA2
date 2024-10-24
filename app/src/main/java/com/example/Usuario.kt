package com.example.qta_tatianaypablo

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "usuarios")
data class Usuario(
    @PrimaryKey val email: String,
    val hashedPassword: String
)