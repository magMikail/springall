package com.magmik.example.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by magMikail on 10/6/2019.
 **/

@Controller
public class MyController {

    public String hello() {
        System.out.println("Hello!!! ");

        return "foo";
    }
}