package guru.springframework.sfg_dependency_injection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN") // specify Profile Qualifier
@Service("i18nService") // give this the same Qualifier as the Spanish version
public class I18nEnglishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World! - EN";
    }
}
