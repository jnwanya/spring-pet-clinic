package com.jnwanya.springpetclinic.model;

import java.time.LocalDate;

/**
 * Created by Jnwanya on
 * Sun, 26 Aug, 2018.
 */
public class Visit extends BaseEntity {

    private LocalDate date;

    private String description;

    private Pet pet;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
