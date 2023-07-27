package com.db.grad.javaapi.service;

import com.db.grad.javaapi.model.Dog;
import com.db.grad.javaapi.repository.DogsRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DogHandler {
    private DogsRepository itsDogsRepo;
    public DogHandler(DogsRepository itsDogRepo) {
        itsDogsRepo = itsDogRepo;
    }

    public long addDog(Dog theDog) {
        return itsDogsRepo.save(theDog);
    }

    public long getNoOfDogs() {
        return itsDogsRepo.count();
    }

    Dog getDogByName( String name ){
        //should return a null if the dog does not exist
        //if several dogs exist with the same name, it should return a null, otherwise it returns the single Dog object
        Dog newDog = new Dog();
        newDog.setName(name);
        //create a list of dog objects
        List<Dog> dogsList = itsDogsRepo.findByName(newDog);
        int count = dogsList.size();
        if (count == 1){
            return itsDogsRepo.findByName(newDog).get(0);
        }
        else{
            return null;
        }
    }

    public Dog getDogById( long id ){
        //should return a null if the dog does not exist
        return itsDogsRepo.findById(id);
    }

    long updateDogDetails( Dog dog ){
        //should return the updated Dog’s ID
        return  itsDogsRepo.save(dog);
    }

    boolean removeDog( long id ){
        //should return true if the dog was removed
        //use optionals to access a specific method
        boolean result = false;
        Optional<Dog> theDog = Optional.ofNullable(itsDogsRepo.findById(id));
        if(theDog.isPresent()){
            itsDogsRepo.delete(theDog.get());
            result = true;
        }
        return result;
    }




}
