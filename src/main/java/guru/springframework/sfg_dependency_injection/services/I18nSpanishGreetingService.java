package guru.springframework.sfg_dependency_injection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"ES", "default"}) // specify Profile Qualifier
@Service("i18nService") // give this the same Qualifier as the English version
public class I18nSpanishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hola Mundo! - ES";
    }
}
