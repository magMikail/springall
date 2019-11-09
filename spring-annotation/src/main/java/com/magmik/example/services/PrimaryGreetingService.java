package com.magmik.example.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by magMikail on 10/7/2019.
 **/

@Service
@Profile("ue")
@Primary // will take this if @Qualifier not defined
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello Primary Greeting Service";
    }
}
