package com.mercadolivro.service

import com.mercadolivro.controller.request.PostCustomerRequest
import com.mercadolivro.controller.request.PutCustomerRequest
import com.mercadolivro.model.CustomerModel
import org.springframework.stereotype.Service
@Service
class CustomerService {

    val customers = mutableListOf<CustomerModel>()

    fun getAll(name: String?): List<CustomerModel> {
        name?.let {
            return customers.filter { it.name.contains(name, true) }
        }
        return customers
    }

    fun create(customer: PostCustomerRequest) {
        val id = if (customers.isEmpty()) {
            1
        } else {
            customers.last().id!!.toInt() + 1
        }

        customers.add(CustomerModel(id, customer.name, customer.email))
    }

    fun getCustomer(id: Int): CustomerModel {
        return customers.filter { it.id == id }.first()
    }

    fun update(id: Int, customer: PutCustomerRequest) {
        return customers.filter { it.id == id }.first().let {
            it.name = customer.name
            it.email = customer.email
        }
    }

    fun delete(id: Int) {
        customers.removeIf { it.id == id }
    }
}