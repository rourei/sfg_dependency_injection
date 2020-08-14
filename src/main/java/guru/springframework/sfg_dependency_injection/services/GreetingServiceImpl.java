package guru.springframework.sfg_dependency_injection.services;

// Implements the method defined in the corresponding interface.

public class GreetingServiceImpl implements GreetingService {

    @Override // override the method specified in the interface
    public String sayGreeting() {
        return "Hello World!";
    }
}
