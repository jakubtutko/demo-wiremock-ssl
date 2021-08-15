package com.jtutko.demo.wiremockssl

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.client.reactive.ClientHttpConnector
import org.springframework.http.client.reactive.ReactorClientHttpConnector
import org.springframework.web.reactive.function.client.WebClient
import reactor.netty.http.client.HttpClient

@Configuration
class DogFactsClientConfiguration {

    @Bean
    fun webApiWebClient(
        clientHttpConnector: ClientHttpConnector,
    ): WebClient = WebClient.builder()
        .baseUrl("https://dog-facts-api.herokuapp.com/api/v1/resources/dogs")
        .clientConnector(clientHttpConnector)
        .build()

    @Bean
    fun clientHttpConnector() = ReactorClientHttpConnector(HttpClient.create())
}
