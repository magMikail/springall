package com.magmik.example.controllers;

import com.magmik.example.SpringDataJpaApplication;
import com.magmik.example.entity.Customer;
import com.magmik.example.repos.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * Created by magMikail on 11/14/2019.
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {SpringDataJpaApplication.class, MainController.class, CustomerRepository.class})
@EnableJpaRepositories

public class MainControllerTest {

    @Autowired
    private CustomerRepository customerRepository;

    @Test
    public void addNewUser() throws Exception {
        customerRepository.save(new Customer("addH2User", "addH2LastName"));
        assertEquals(((Collection<?>) customerRepository.findAll()).size(), 1);
    }

    @Test
    public void getAllUsers() throws Exception {
    }

}