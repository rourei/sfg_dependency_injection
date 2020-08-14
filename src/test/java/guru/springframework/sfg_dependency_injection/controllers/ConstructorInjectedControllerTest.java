package guru.springframework.sfg_dependency_injection.controllers;

import guru.springframework.sfg_dependency_injection.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// This is basically what the Spring framework does and it is the preferred method for dependency injection.

class ConstructorInjectedControllerTest {

    // The controller to be tested
    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        // Create an instance of the controller and inject the dependency directly inside the constructor
        controller = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}