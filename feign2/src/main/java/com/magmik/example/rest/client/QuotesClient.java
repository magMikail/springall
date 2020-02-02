package com.magmik.example.rest.client;

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

    @RequestLine("GET /")
    @Headers("Content-Type: application/json")
    Collection<Quote> getApps(@QueryMap Map<String, String> queryMap); //GET https://gturnquist-quoters.cfapps.io/api/5?key1=value1&key2=value2&key3=value3

}
//possible to use this without any FeignConfiguration
//package com.magmik.feign;
//
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import java.util.Collection;
//
//@FeignClient(name = "QuoteConsumer", url = "https://gturnquist-quoters.cfapps.io/api")
//public interface QuotesServiceProxy {
//
//    @RequestMapping("/{id}")
//    public Quote findById(@PathVariable(value = "id") Long id);
//
//    @RequestMapping("/")
//    public Collection<Quote> findAll();
//}

// plus
//<dependency>
//            <groupId>org.springframework.cloud</groupId>
//            <artifactId>spring-cloud-starter-openfeign</artifactId>
//        </dependency>
