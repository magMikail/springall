package com.magmik.example.service;

import com.magmik.example.QuotesClient;
import com.magmik.example.model.Quote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class QuotesService implements DataService {
    private final QuotesClient quotesClient;

    @Autowired
    public QuotesService(QuotesClient quotesClient) {
        this.quotesClient = quotesClient;
    }

    @Override
    public Quote getById(Long id) {
        return quotesClient.getById(id);
    }

    @Override
    public Collection<Quote> getAll() {
        return quotesClient.getAll();
    }

}
