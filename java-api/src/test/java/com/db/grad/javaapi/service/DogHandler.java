package com.db.grad.javaapi.service;

import com.db.grad.javaapi.model.Dog;
import com.db.grad.javaapi.repository.DogsRepository;

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
        Dog newDog = new Dog();
        newDog.setName(name);
        int count = itsDogsRepo.findByName(newDog).size();
        if(count > 1){
            return null;
        }
        else if (count == 1){
            return itsDogsRepo.findByName(newDog).get(0);
        }
        else{
            return null;
        }
    }


}
