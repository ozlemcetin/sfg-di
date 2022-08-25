package com.springframework.pets;

//Service
public class PetServiceFactory {

    public PetService getPetService(String petType) {

        switch (petType) {

            case "dog":
                return new DogPetService();
            case "cat":
                return new CatPetService();
            default:
                throw new RuntimeException("no service definition found for the given per type " + petType);
        }

    }
}
