package ru.shilaev.orderexecutionservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class OrderExecutionServiceApplication

fun main(args: Array<String>) {
    runApplication<OrderExecutionServiceApplication>(*args)
}
