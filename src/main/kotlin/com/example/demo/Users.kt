package com.example.demo

import com.google.gson.Gson
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity

data class Users(var nombre: String, var pass: String,var clave: String, var mensaje: String){

    @Id
    @GeneratedValue
    var id = 0
    override fun toString(): String {
        val gson= Gson()
        return gson.toJson(this)
    }
    @GeneratedValue
    var name= ""
}
data class listaUsers(var nombre:String, var pass:String) {

}