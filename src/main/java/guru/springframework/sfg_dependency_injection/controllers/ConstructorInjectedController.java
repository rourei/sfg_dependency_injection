package guru.springframework.sfg_dependency_injection.controllers;

import guru.springframework.sfg_dependency_injection.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

// This controller uses its constructor for dependency injection of an object at runtime.
// This is best practice.

@Controller
public class ConstructorInjectedController {

    // This private member will be holding the injected objected, access via constructor
    private final GreetingService greetingService; // using final to avoid re-assignment

    // This constructor will be used to inject the implementation of the interface at runtime (by the test class)
    // @Autowired OPTIONAL SINCE SPRING 5!
    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    // Method to be tested
    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
