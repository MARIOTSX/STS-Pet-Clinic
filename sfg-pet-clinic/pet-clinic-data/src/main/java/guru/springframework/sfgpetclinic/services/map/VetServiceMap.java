package guru.springframework.sfgpetclinic.services.map;

import java.util.Set;

import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.CrudService;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {

    @Override
    public void delete(Vet object) {
        // TODO Auto-generated method stub
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        // TODO Auto-generated method stub
        super.deleteById(id);
    }

    @Override
    public Set<Vet> findAll() {
        // TODO Auto-generated method stub
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        // TODO Auto-generated method stub
        return super.findById(id);
    }

    @Override
    public Vet save(Long id, Vet object) {
        // TODO Auto-generated method stub
        return super.save(object.getId(), object);
    }

    @Override
    public Vet save(Vet object) {
        // TODO Auto-generated method stub
        return null;
    }
    
}