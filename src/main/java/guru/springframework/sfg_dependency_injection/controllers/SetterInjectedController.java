package guru.springframework.sfg_dependency_injection.controllers;

import guru.springframework.sfg_dependency_injection.services.GreetingService;

// Uses a setter method to inject the dependency.

public class SetterInjectedController {

    // This private member will be holding the injected objected, access via setter method below
    private GreetingService greetingService;

    // This setter will be used to inject the implementation of the interface at runtime (by the test class)
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    // Method to be tested
    public String getGreeting(){
        return greetingService.sayGreeting();
    }


}
