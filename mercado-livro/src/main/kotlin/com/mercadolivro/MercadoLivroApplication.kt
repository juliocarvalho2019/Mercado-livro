package com.mercadolivro

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.Async

@Async
@SpringBootApplication
class MercadoLivroApplication

fun main(args: Array<String>) {
    runApplication<MercadoLivroApplication>(*args)
}
