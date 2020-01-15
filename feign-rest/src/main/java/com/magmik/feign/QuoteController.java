package com.magmik.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class QuoteController {

    @Autowired
    QuotesServiceProxy proxyService;

    @RequestMapping("/giveMe/{id}")
    public Quote findme(@PathVariable Long id) {
        return proxyService.findById(id);
    }

    @RequestMapping("/all")
    public Collection<Quote> getAll() {
        return proxyService.findAll();
    }
}
