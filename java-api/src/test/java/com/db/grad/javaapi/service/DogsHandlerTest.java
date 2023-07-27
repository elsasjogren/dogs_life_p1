package com.db.grad.javaapi.service;

import com.db.grad.javaapi.model.Dog;
import com.db.grad.javaapi.repository.DogsRepository;
import com.db.grad.javaapi.repository.DogsRepositoryStub;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class DogsHandlerTest {
    private DogsRepository itsDogRepo = new DogsRepositoryStub();

    @BeforeEach
    public void makeSureRepoIsEmpty(){
        itsDogRepo.deleteAll();
    }
    @Test
    public void add_a_dog_return_number_of_dogs_in_repo_is_one(){
        //arrange
        DogHandler cut = new DogHandler(itsDogRepo);
        Dog theDog = new Dog();
        theDog.setName("Bruno");
        cut.addDog( theDog );

        int expectedResult = 1;

        //act
        long actualResult = cut.getNoOfDogs();
        //assert
        assertEquals( expectedResult, actualResult );

    }

    @Test
    public  void    add_several_dogs_return_number_of_dogs_match_number_added(){
        DogHandler cut = new DogHandler(itsDogRepo);
        Dog theDog = new Dog();
        theDog.setName("Bear");
        cut.addDog( theDog );

        Dog theDog1 = new Dog();
        theDog1.setName("Peanut");
        cut.addDog( theDog1 );

        Dog theDog2 = new Dog();
        theDog2.setName("Jonathon");
        cut.addDog( theDog2 );

        Dog theDog3 = new Dog();
        theDog3.setName("Happy");
        cut.addDog( theDog3 );

        Dog theDog4 = new Dog();
        theDog4.setName("Luna");
        cut.addDog( theDog4 );

        Dog theDog5 = new Dog();
        theDog5.setName("Scamp");
        cut.addDog( theDog5 );

        Dog theDog6 = new Dog();
        theDog6.setName("Joy");
        cut.addDog( theDog6 );

        Dog theDog7 = new Dog();
        theDog7.setName("Winston");
        cut.addDog( theDog7 );

        Dog theDog8 = new Dog();
        theDog8.setName("Link");
        cut.addDog( theDog8 );
        Dog theDog9 = new Dog();
        theDog9.setName("Brother");
        cut.addDog( theDog9 );
        Dog theDog10 = new Dog();
        theDog10.setName("Scofield");
        cut.addDog( theDog10 );
        Dog theDog11 = new Dog();
        theDog11.setName("Simba");
        cut.addDog( theDog11 );
        Dog theDog12 = new Dog();
        theDog12.setName("Dog");
        cut.addDog( theDog12 );
        int expectedResult = 13;
        //act
        long actualResult = cut.getNoOfDogs();
        //assert
        assertEquals( expectedResult, actualResult );
    }

    //write tests for 4 new methods
    @Test
    public  void testGetDogByName(){
        //arrange
        DogHandler cut = new DogHandler(itsDogRepo);
        Dog theDog = new Dog();
        theDog.setName("Bean");
        cut.addDog( theDog );
        Dog expectedResult = theDog;
        Dog result = cut.getDogByName("Bean");
        //act
        //assert
        assertEquals( expectedResult, result );

    }

    @Test
    public  void testGetDogById(){
        //arrange
        DogHandler cut = new DogHandler(itsDogRepo);
        Dog theDog = new Dog();
        theDog.setId(12);
        cut.addDog( theDog );
        Dog expectedResult = theDog;
        Dog result = cut.getDogById(theDog.getId());
        //act
        //assert
        assertEquals( expectedResult, result );
    }

    @Test
    public  void testUpdateDogDetails(){
        DogHandler cut = new DogHandler(itsDogRepo);
        Dog theDog = new Dog();
        theDog.setId(12);
        cut.addDog( theDog );
        //theDog.updateDogDetails
        Dog theDog2 = new Dog();
        theDog2.setId(2);
        long id = cut.updateDogDetails(theDog2);
        assertEquals( 2, id );
    }

    @Test
    public  void testRemoveDog(){
        DogHandler cut = new DogHandler(itsDogRepo);
        Dog theDog = new Dog();
        theDog.setId(12);
        cut.addDog( theDog );
        boolean result = cut.removeDog(theDog.getId());
        Dog expectedResult = theDog;
        assertEquals( true, result );
    }


}
