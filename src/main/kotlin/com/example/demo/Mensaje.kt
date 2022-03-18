package com.example.demo

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Mensaje(var texto:String, val usuarioId:String) {
    @Id
    @GeneratedValue
    var id = 0

    val time=35436
}