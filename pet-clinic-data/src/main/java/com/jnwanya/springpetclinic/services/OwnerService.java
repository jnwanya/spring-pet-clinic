package com.jnwanya.springpetclinic.services;

import com.jnwanya.springpetclinic.model.Owner;

import java.util.Set;

/**
 * Created by Jnwanya on
 * Fri, 17 Aug, 2018.
 */
public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
