package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {
	runApplication<DemoApplication>(*args)
	//curl --request POST  --header "Content-type:application/json; charset=utf-8" --data "{\"nombre\":\"U4\",\"pass\":\"123\"}" localhost:8083/crearUsuario
}
