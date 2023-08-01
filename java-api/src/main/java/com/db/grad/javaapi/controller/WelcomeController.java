package com.db.grad.javaapi.controller;

import com.db.grad.javaapi.model.Dog;
import com.db.grad.javaapi.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class WelcomeController {

  @Autowired
  DogService dogService;

  @GetMapping("/status")
  public String getWelcome() {
    return "Dogs API is up and running!";
  }

  @GetMapping("/dogs")
  public List<Dog> getAllDogs() {
    return dogService.getAllDogs();
  }

  @GetMapping("/numberofdogs")
  public long getNoOfDogs() {
    return dogService.getNoOfDogs();
  }

  @GetMapping("/dogs/name/{dogname}")
  public Dog getDogByName(@PathVariable String dogname) {
    return dogService.getDogByName(dogname);
  }

  @GetMapping("/dogs/id/{dogid}")
  public Dog getDogById(@PathVariable int dogid) {
    return dogService.getDogById(dogid);
  }

}
