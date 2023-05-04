package com.mercadolivro.controller.request

import com.mercadolivro.validation.EmailAvailable
import javax.validation.constraints.Email
import javax.validation.constraints.NotEmpty

data class PostCustomerRequest (
    @field:NotEmpty(message = "Campo nome não pode ser vazio!")
    var name: String,
    @field:Email(message = "Digite um e-mail válido!")
    @EmailAvailable
    var email: String
)