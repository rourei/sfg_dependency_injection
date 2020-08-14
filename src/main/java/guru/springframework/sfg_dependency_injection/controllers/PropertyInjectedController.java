package guru.springframework.sfg_dependency_injection.controllers;

import guru.springframework.sfg_dependency_injection.services.GreetingService;

// This is the least preferred method for dependency injection since it provides bad testability.

public class PropertyInjectedController {

    // This public member will be holding the injected objected
    public GreetingService greetingService;

    // Method to be tested
    public String getGreeting(){
        // Direct access of the injected method
        return greetingService.sayGreeting();
    }
}
