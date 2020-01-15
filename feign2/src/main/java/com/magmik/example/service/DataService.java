package com.magmik.example.service;

import com.magmik.example.model.Quote;

import java.util.Collection;

public interface DataService {
    Quote getById(Long id);

    Collection<Quote> getAll();
}
