package com.example.approomexemplo.controller

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [Contato::class],
    version = 1
)


//herança
// classe abstrata

abstract class ContatoDatabase: RoomDatabase(){
    abstract val dao: ContatoDao

}