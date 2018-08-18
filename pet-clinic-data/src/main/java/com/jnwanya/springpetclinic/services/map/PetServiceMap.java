package com.jnwanya.springpetclinic.services.map;

import com.jnwanya.springpetclinic.model.Pet;
import com.jnwanya.springpetclinic.services.CrudService;

import java.util.Set;

/**
 * Created by Jnwanya on
 * Sat, 18 Aug, 2018.
 */
public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
