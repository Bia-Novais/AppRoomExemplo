package com.example.approomexemplo.controller

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow


// interface é uma forma de fazer o caminho entre a tela e o banco de dados

@Dao
interface ContatoDao{
    //faz o upload ou insert de algum dado
    @Upsert
    //o suspend serve para que o método seja execultado somente depois que compilador fazer a primerira execulção
    // e depois que o método for execultado por uma ação(um botão, um enter, etc)
    suspend fun upsertContato(contato: Contato)

    @Delete
    suspend fun deleteContato(contato: Contato)

    @Query("SELECT * FROM contato ORDER BY nome ASC")
    fun getContatoOrdenadoPeloNome(): Flow<List<Contato>>//import flow kotlin, flow recebe uma array list contendo todos os dadosda tabela contato

    @Query("SELECT * FROM contato ORDER BY sobrenome ASC")
    fun getContatoordenadoPeloSobrenome(): Flow<List<Contato>>

    @Query("SELECT * FROM contato ORDER BY telefone ASC")
    fun getContatoOrdenadoPeloTelefone(): Flow<List<Contato>>
}