package ru.shilaev.marketdataservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MarketDataServiceApplication

fun main(args: Array<String>) {
    runApplication<MarketDataServiceApplication>(*args)
}
