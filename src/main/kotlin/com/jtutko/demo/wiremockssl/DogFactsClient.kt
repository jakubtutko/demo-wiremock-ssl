package com.jtutko.demo.wiremockssl

import kotlinx.coroutines.runBlocking
import org.springframework.http.MediaType
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.reactive.function.client.awaitBody

@Component
class DogFactsClient(
    private val dogFactsWebClient: WebClient,
) {

    fun fetchDogFact(factNumber: Long) = runBlocking {
        dogFactsWebClient
            .get()
            .uri { builder -> builder.queryParam("number", factNumber).build() }
            .accept(MediaType.APPLICATION_JSON)
            .retrieve()
            .awaitBody<String>()
    }
}
