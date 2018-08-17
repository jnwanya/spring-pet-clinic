package com.jnwanya.springpetclinic.services;

import com.jnwanya.springpetclinic.model.Pet;

import java.util.Set;

/**
 * Created by Jnwanya on
 * Fri, 17 Aug, 2018.
 */
public interface PetService {

    Pet findById(Long id);

    Pet save(Pet owner);

    Set<Pet> findAll();
}
