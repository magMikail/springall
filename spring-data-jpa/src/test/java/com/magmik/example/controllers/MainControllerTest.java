package com.magmik.example.controllers;

import com.magmik.example.entity.Customer;
import com.magmik.example.repos.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@DataJpaTest
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