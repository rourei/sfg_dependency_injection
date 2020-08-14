package guru.springframework.sfg_dependency_injection.controllers;

import guru.springframework.sfg_dependency_injection.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

// This is the least preferred method for dependency injection since it provides bad testability.

@Controller
public class PropertyInjectedController {

    // This public member will be holding the injected objected
    @Qualifier("propertyGreetingService") // define which Bean should be injected
    @Autowired
    public GreetingService greetingService;

    // Method to be tested
    public String getGreeting(){
        // Direct access of the injected method
        return greetingService.sayGreeting();
    }
}
