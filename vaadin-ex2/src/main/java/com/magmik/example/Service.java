package com.magmik.example;

import org.springframework.stereotype.Component;

/**
 * Created by magMikail on 10/5/2019.
 **/

@Component
public class Service {
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
