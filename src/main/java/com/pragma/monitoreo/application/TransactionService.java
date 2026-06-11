package com.pragma.monitoreo.application;

import com.pragma.monitoreo.domain.Transaction;
import com.pragma.monitoreo.infrastructure.TransactionClient;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class TransactionService {
    private final TransactionClient transactionClient;

    public TransactionService(TransactionClient transactionClient) {
        this.transactionClient = transactionClient;
    }

    public Flux<Transaction> getTransactions() {
        return transactionClient.getTransactions()
               .onErrorResume(e -> Flux.empty());
    }
}