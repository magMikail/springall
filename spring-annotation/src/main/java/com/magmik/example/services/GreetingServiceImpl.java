package com.magmik.example.services;

import org.springframework.stereotype.Service;

/**
 * Created by magMikail on 10/6/2019.
 **/

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_GURUS = "Hello Gurus!!!!";

    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }
}