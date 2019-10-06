package com.magmik.example.services;

import org.springframework.stereotype.Service;

/**
 * Created by magMikail on 10/6/2019.
 **/

@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello - I was injected via the constructor!!!";
    }
}
