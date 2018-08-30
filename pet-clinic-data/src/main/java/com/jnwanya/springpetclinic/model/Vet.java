package com.jnwanya.springpetclinic.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Jnwanya on
 * Thu, 16 Aug, 2018.
 */
public class Vet extends Person {

    private Set<Speciality> specialities = new HashSet<>();

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }
}
