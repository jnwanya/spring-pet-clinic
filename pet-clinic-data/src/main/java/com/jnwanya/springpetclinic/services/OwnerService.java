package com.jnwanya.springpetclinic.services;

import com.jnwanya.springpetclinic.model.Owner;


/**
 * Created by Jnwanya on
 * Fri, 17 Aug, 2018.
 */
public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String lastName);
}
