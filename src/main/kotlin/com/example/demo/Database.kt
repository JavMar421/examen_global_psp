package com.example.demo

import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.repository.findByIdOrNull
import java.security.MessageDigest
import javax.crypto.spec.SecretKeySpec

@Configuration
class Database {
    @Bean
    fun initDatabase(adminrepositorio: UserAdminRepository, usuariorepositorio:UserRepository, mensajeRepository: MensajeRepository): CommandLineRunner {
        return CommandLineRunner {
            println("Base de datos creándose")
            //Guardamos los Datos del Administrador
            adminrepositorio.save(UsuarioAdmin("DAM2","123456"))
            println(adminrepositorio.findAll().size)
            println("Base de datos de mensajes creada")
        }
    }
}