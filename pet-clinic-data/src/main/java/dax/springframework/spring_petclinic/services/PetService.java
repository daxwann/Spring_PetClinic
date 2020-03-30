package dax.springframework.spring_petclinic.services;

import dax.springframework.spring_petclinic.model.Pet;

import java.util.Set;

public interface PetService {
  Pet findById(Long id);

  Pet save(Pet pet);

  Set<Pet> findAll();
}
