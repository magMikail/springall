package com.magmik.example.controller;

import com.magmik.example.model.Quote;
import com.magmik.example.service.QuotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class QuoteController {

    private final QuotesService quotesService;

    @Autowired
    public QuoteController(final QuotesService quotesService) {
        this.quotesService = quotesService;
    }

    @RequestMapping("/giveMe/{id}")
    public Quote findMe(@PathVariable Long id) {
        return quotesService.getById(id);
    }

    @RequestMapping("/all")
    public Collection<Quote> getAll() {
        return quotesService.getAll();
    }
}
