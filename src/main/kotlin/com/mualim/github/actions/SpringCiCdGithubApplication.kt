package com.mualim.github.actions

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
@RequestMapping("/api/v1")
class SpringCiCdGithubApplication {
    @GetMapping("/welcome")
    fun welcome(): String = "Welcome to the Spring"
    fun hello(): String = "Hello"
}

fun main(args: Array<String>) {
    runApplication<SpringCiCdGithubApplication>(*args)
}
