package com.db.grad.javaapi.repository;

import com.db.grad.javaapi.model.Dog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DogsRepository extends JpaRepository<Dog, Integer> {

    List<Dog> findByName(Dog dogToFind);
}
