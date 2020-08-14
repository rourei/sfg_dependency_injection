package guru.springframework.sfg_dependency_injection.services;

// Implements the method defined in the corresponding interface.

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {

    @Override // override the method specified in the interface
    public String sayGreeting() {
        return "Hello World! - Constructor";
    }
}
