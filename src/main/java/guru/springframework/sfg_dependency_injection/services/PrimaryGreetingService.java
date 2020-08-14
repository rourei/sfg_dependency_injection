package guru.springframework.sfg_dependency_injection.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary // mark this Bean as "standard" to be injected if nothing else is specified (e.g. via Qualifiers)
@Service
public class PrimaryGreetingService implements GreetingService {

    @Override // override the method specified in the interface
    public String sayGreeting() {
        return "Hello World! - Greetings from the Primary Bean";
    }

}
