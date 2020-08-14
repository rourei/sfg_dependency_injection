package guru.springframework.sfg_dependency_injection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dog", "default"})
@Service // annotation was missing
public class DogPetService implements PetService {

    @Override
    public String getPetType(){
        return "Dogs are the best!";
    }
}
