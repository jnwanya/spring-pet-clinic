package com.jnwanya.springpetclinic.services.map;

import com.jnwanya.springpetclinic.model.Vet;
import com.jnwanya.springpetclinic.services.CrudService;

import java.util.Set;

/**
 * Created by Jnwanya on
 * Sat, 18 Aug, 2018.
 */
public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}