package com.jnwanya.springpetclinic.services;

import com.jnwanya.springpetclinic.model.Vet;

import java.util.Set;

/**
 * Created by Jnwanya on
 * Fri, 17 Aug, 2018.
 */
public interface VetService {

    Vet findById(Long id);

    Vet save(Vet owner);

    Set<Vet> findAll();
}
