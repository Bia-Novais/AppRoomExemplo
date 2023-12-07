package com.example.approomexemplo.controller

import androidx.room.Entity
import androidx.room.PrimaryKey

//fazer implementações no gradle

@Entity(tableName = "contato")
data class Contato(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val nome: String,
    val sobrenome: String,
    val telefone: String
)
