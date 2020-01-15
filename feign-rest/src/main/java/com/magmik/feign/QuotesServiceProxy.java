package com.magmik.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

@FeignClient(name = "QuoteConsumer", url = "https://gturnquist-quoters.cfapps.io/api")
public interface QuotesServiceProxy {

    @RequestMapping("/{id}")
    public Quote findById(@PathVariable(value = "id") Long id);

    @RequestMapping("/")
    public Collection<Quote> findAll();
}
