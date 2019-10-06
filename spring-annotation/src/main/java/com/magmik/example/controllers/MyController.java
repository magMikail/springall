package com.magmik.example.controllers;

import com.magmik.example.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Created by magMikail on 10/6/2019.
 **/

@Controller
public class MyController {

    GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        System.out.println("Hello!!! ");

        return this.greetingService.sayGreeting();
    }
}