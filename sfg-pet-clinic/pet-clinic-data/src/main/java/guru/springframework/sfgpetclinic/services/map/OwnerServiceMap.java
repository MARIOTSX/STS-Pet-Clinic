package guru.springframework.sfgpetclinic.services.map;

import java.util.Set;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.services.CrudService;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

    @Override
    public void delete(Owner object) {
        // TODO Auto-generated method stub
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        // TODO Auto-generated method stub
        super.deleteById(id);
    }

    @Override
    public Set<Owner> findAll() {
        // TODO Auto-generated method stub
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        // TODO Auto-generated method stub
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        // TODO Auto-generated method stub
        return super.save(object.getId(), object);
    }

    @Override
    public Owner save(Long id, Owner object) {
        // TODO Auto-generated method stub
        return super.save(id, object);
    }
    
}