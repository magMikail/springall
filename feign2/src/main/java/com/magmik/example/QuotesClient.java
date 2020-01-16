package com.magmik.example;

import com.magmik.example.model.Quote;
import feign.Headers;
import feign.Param;
import feign.QueryMap;
import feign.RequestLine;

import java.util.Collection;
import java.util.Map;

public interface QuotesClient {
    @RequestLine("GET /{id}")
    Quote getById(@Param("id") Long id);

    @RequestLine("GET /")
    Collection<Quote> getAll();

    @RequestLine("GET /5")
    @Headers("Content-Type: application/json")
    Collection<Quote> getApps(@QueryMap Map<String, String> queryMap); //GET https://gturnquist-quoters.cfapps.io/api/5?key1=value1&key2=value2&key3=value3

}
