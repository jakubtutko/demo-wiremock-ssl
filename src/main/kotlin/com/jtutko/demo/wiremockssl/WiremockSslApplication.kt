package com.jtutko.demo.wiremockssl

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WiremockSslApplication

fun main(args: Array<String>) {
	runApplication<WiremockSslApplication>(*args)
}
