package com.jnwanya.springpetclinic.model;

import java.io.Serializable;

/**
 * Created by Jnwanya on
 * Fri, 17 Aug, 2018.
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
