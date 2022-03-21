package com.example.todorolagem.model

data class tarefa (
    var nome: String,
    var descricao: String,
    var responsavel: String,
    var data: String,
    var andamento: Boolean,
    var categoria: String){

}