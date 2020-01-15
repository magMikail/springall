package com.magmik.example;

import com.magmik.example.model.Quote;
import feign.Param;
import feign.RequestLine;

import java.util.Collection;

public interface QuotesClient {
    @RequestLine("GET /{id}")
    Quote getById(@Param("id") Long id);

    @RequestLine("GET /")
    Collection<Quote> getAll();
}
