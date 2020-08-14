package guru.springframework.sfg_dependency_injection.controllers;

import guru.springframework.sfg_dependency_injection.services.PetService;
import org.springframework.stereotype.Controller;

@Controller // annotation was missing -> Spring could not find this component
public class PetController {

    private final PetService petService;

    // Constructor was missing
    public PetController(PetService petService) {
        this.petService = petService;
    }

    public String whichPetIsTheBest(){
        return petService.getPetType();
    }
}
