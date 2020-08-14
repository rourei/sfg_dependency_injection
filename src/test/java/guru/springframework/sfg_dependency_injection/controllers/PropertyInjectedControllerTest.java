package guru.springframework.sfg_dependency_injection.controllers;

import guru.springframework.sfg_dependency_injection.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

// Uses direct access to the class properties for dependency injection.
// This is the least preferred method.

class PropertyInjectedControllerTest {

    // The controller to be tested
    PropertyInjectedController controller;

    @BeforeEach
    void setUp(){
        // Create new instance of the controller to be tested
        controller = new PropertyInjectedController();

        // Create an instance of the interface implementation and directly assign it to the member
        controller.greetingService = new ConstructorGreetingService();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}