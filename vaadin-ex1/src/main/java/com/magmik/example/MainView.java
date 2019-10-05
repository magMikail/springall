package com.magmik.example;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

//simple grid without filter and edit
@Route("123")
public class MainView extends VerticalLayout {

    final Grid<Customer> grid;
    private final CustomerRepository repo;

    public MainView(CustomerRepository repo) {
        this.repo = repo;
        this.grid = new Grid<>(Customer.class);
        add(grid);
        listCustomers();
    }

    private void listCustomers() {
        grid.setItems(repo.findAll());
    }

}