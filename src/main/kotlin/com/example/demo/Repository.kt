package com.example.demo

import org.springframework.data.jpa.repository.JpaRepository

interface UserAdminRepository : JpaRepository<UsuarioAdmin, Int>
interface UserRepository : JpaRepository<User, Int>
interface MensajeRepository : JpaRepository<Mensaje, Int>