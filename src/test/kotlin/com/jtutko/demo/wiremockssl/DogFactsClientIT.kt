package com.jtutko.demo.wiremockssl

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.TestConstructor
import org.springframework.test.context.TestConstructor.AutowireMode

@SpringBootTest
@TestConstructor(autowireMode = AutowireMode.ALL)
class DogFactsClientIT(
    private val dogFactsClient: DogFactsClient,
) {

    @Test
    fun `test dog facts api`() {
        val respone = dogFactsClient.fetchDogFact(1)

        assertThat(respone).isNotEmpty
    }
}
