package com.jnwanya.springpetclinic.bootstrap;

import com.jnwanya.springpetclinic.model.Owner;
import com.jnwanya.springpetclinic.model.Vet;
import com.jnwanya.springpetclinic.services.OwnerService;
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

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }


    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setFirstName("John");
        owner1.setLastName("Doe");
        owner1.setId(1L);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Luke");
        owner2.setLastName("Cake");
        owner2.setId(2L);

        ownerService.save(owner2);

        System.out.println("Loading owners");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vet1.setId(1L);

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Hank");
        vet2.setLastName("Jerry");
        vet2.setId(2L);

        vetService.save(vet2);

        System.out.println("Loading vets");

    }
}
