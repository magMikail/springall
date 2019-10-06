package com.magmik.example;

import com.magmik.example.controllers.ConstructorInjectedController;
import com.magmik.example.controllers.GetterInjectedController;
import com.magmik.example.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
//		SpringApplication.run(Application.class, args);

        ApplicationContext ctx = SpringApplication.run(Application.class, args);

        MyController controller = (MyController) ctx.getBean("myController");

        controller.hello();
        System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());

    }


}
