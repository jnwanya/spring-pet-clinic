package com.jnwanya.springpetclinic.model;

import java.time.LocalDate;

/**
 * Created by Jnwanya on
 * Thu, 16 Aug, 2018.
 */
public class Pet extends BaseEntity{

    private String name;

    private PetType petType;

    private Owner owner;

    private LocalDate birthDate;

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
