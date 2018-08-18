package com.jnwanya.springpetclinic.services;

import java.util.Set;

/**
 * Created by Jnwanya on
 * Sat, 18 Aug, 2018.
 */
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
