package com.example

import androidx.room.Dao
import androidx.room.Query
import com.example.qta_tatianaypablo.Usuario

@Dao
interface UsuarioDao {
    @Query("SELECT * FROM usuarios WHERE email = :email LIMIT 1")
    suspend fun obtenerUsuarioPorEmail(email: String): Usuario?
}
