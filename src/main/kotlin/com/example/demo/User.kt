package com.example.demo

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class User(val nombre:String,val pass:String,val clavecifrado:String) {
    @Id
    @GeneratedValue
    var id = 0
}

class Userfiltrado(val nombre:String,val clavecifrado:String) {

}
