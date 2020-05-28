package guru.springframework.sfgpetclinic.services;
 

import guru.springframework.sfgpetclinic.model.*;

public interface OwnerService extends CrudService<Owner,Long> {

   Owner findByLastName(String LastName);
   
}