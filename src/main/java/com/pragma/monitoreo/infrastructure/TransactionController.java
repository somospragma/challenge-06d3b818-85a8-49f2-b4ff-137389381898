package com.pragma.monitoreo.infrastructure;

import com.pragma.monitoreo.application.TransactionService;
import com.pragma.monitoreo.domain.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class TransactionController {
    private final TransactionService transactionService;

    @Autowired
    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping("/transactions")
    public Flux<Transaction> getTransactions() {
        return transactionService.getTransactions();
    }
}