package com.pragma.monitoreo.infrastructure;

import com.pragma.monitoreo.domain.Transaction;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@Component
public class TransactionClient {
    private final WebClient webClient;

    public TransactionClient(WebClient.Builder webClientBuilder, @Value("${spring.webflux.base-url}") String baseUrl) {
        this.webClient = webClientBuilder.baseUrl(baseUrl).build();
    }

    @CircuitBreaker(name = "transactionService", fallbackMethod = "fallbackGetTransactions")
    @Retry(name = "transactionService")
    public Flux<Transaction> getTransactions() {
        return webClient.get()
               .uri("/transactions")
               .retrieve()
               .bodyToFlux(Transaction.class);
    }

    public Flux<Transaction> fallbackGetTransactions(Throwable t) {
        return Flux.empty();
    }
}