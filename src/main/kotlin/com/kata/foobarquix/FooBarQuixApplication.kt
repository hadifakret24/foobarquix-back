package com.kata.foobarquix

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class FooBarQuixApplication

fun main(args: Array<String>) {
	runApplication<FooBarQuixApplication>(*args)
}
