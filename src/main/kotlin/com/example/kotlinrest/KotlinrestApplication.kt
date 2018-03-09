package com.example.kotlinrest

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class KotlinrestApplication

@RestController
@CrossOrigin
class MyProductController {
    @GetMapping("/products")
    fun getproducts() = listOf("Home Loans", "Vehicle Finance", "Personal Loans", "Credit Cards")
}

fun main(args: Array<String>) {
    SpringApplication.run(KotlinrestApplication::class.java, *args)
}
