package guru.springframework.sfg_dependency_injection.controllers;

import guru.springframework.sfg_dependency_injection.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

// Uses the setter to inject the greeting service.

class SetterInjectedControllerTest {

    // The controller to be tested
    SetterInjectedController controller;

    @BeforeEach
    void setUp(){
        // Create an instance of the controller
        controller = new SetterInjectedController();
        // Use the provided setter to inject the dependency
        controller.setGreetingService(new ConstructorGreetingService());
    }

    @Test
    void setGreetingService() {
        System.out.println(controller.getGreeting());
    }
}