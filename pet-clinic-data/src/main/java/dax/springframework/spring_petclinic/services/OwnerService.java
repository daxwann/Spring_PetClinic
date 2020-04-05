package dax.springframework.spring_petclinic.services;

import dax.springframework.spring_petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
  Owner findByLastName(String lastName);
}