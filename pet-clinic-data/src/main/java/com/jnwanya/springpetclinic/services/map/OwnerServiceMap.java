package com.jnwanya.springpetclinic.services.map;

import com.jnwanya.springpetclinic.model.Owner;
import com.jnwanya.springpetclinic.services.CrudService;

import java.util.Set;

/**
 * Created by Jnwanya on
 * Sat, 18 Aug, 2018.
 */
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }
}
