package com.mercadolivro.controller.request

import javax.validation.constraints.Email
import javax.validation.constraints.NotEmpty

data class PutCustomerRequest (
    @field:NotEmpty(message = "Campo nome não pode ser vazio!")
    var name: String,
    @field:Email(message = "Digite um e-mail válido!")
    var email: String
)