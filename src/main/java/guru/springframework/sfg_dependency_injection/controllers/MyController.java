package guru.springframework.sfg_dependency_injection.controllers;

import org.springframework.stereotype.Controller;

@Controller // Spring manages the creation of instances of this controller
public class MyController {

    public String sayHello(){

        System.out.println("Hello World!");

        return "Hi folks!";
    }
}
