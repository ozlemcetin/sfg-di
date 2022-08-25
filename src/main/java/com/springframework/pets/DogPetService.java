package com.springframework.pets;

//@Profile({"dog", "default"})
//@Service
public class DogPetService implements PetService {

    @Override
    public String getPetType() {
        return "Dogs Are the Best!";
    }
}
