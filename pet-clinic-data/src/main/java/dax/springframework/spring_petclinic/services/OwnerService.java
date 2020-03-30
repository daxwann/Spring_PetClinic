package dax.springframework.spring_petclinic.services;

import dax.springframework.spring_petclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
  Owner findById(Long id);

  Owner findByLastName(String lastName);

  Owner save(Owner owner);

  Set<Owner> findAll();
}