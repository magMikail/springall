package com.magmik.example;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by magMikail on 10/5/2019.
 **/

@Route("")
public class VaadinUI extends VerticalLayout {

    TextField name = new TextField("Enter your name:");
    Button button = new Button("Send");
    @Autowired
    private Service service;

    public VaadinUI() {
        button.addClickListener(e -> Notification.show(service.sayHello(name.getValue())));
        add(name, button);
    }


}
