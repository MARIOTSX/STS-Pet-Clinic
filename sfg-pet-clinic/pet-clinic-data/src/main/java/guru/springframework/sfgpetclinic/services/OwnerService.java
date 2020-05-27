package guru.springframework.sfgpetclinic.services;

import java.util.Set;

import guru.springframework.sfgpetclinic.model.*;

public interface OwnerService {

   Owner findByLastName(String LastName);
   Owner findById(Long id);
   Owner save(Owner owner);
   Set<Owner> findAll();   
}