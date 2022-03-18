package com.example.demo

data class Retorno(val list:List<Mensaje>) {
}

data class RetornoAdmin(val list:MutableList<Userfiltrado>) {
}
data class MensajeAdmin(val texto:String,val usuarioId:String)
data class RetornoMensajes(val lista:MutableList<MensajeAdmin>)