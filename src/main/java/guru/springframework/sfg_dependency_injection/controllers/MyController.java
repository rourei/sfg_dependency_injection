package guru.springframework.sfg_dependency_injection.controllers;

import guru.springframework.sfg_dependency_injection.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller // Spring manages the creation of instances of this controller
public class MyController {

    private final GreetingService greetingService;

    // Since the Bean is not explicitly specified with a Qualifier, MyController will be injected with the Primary Bean
    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
