package com.jnwanya.springpetclinic.bootstrap;

import com.jnwanya.springpetclinic.model.Owner;
import com.jnwanya.springpetclinic.model.PetType;
import com.jnwanya.springpetclinic.model.Vet;
import com.jnwanya.springpetclinic.services.OwnerService;
import com.jnwanya.springpetclinic.services.PetTypeService;
import com.jnwanya.springpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by Jnwanya on
 * Mon, 20 Aug, 2018.
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;

    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }


    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        dog = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        cat = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("John");
        owner1.setLastName("Doe");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Luke");
        owner2.setLastName("Cake");

        ownerService.save(owner2);

        System.out.println("Loading owners");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Hank");
        vet2.setLastName("Jerry");

        vetService.save(vet2);

        System.out.println("Loading vets");

    }
}
