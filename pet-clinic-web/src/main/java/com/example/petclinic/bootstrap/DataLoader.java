package com.example.petclinic.bootstrap;

import com.example.petclinic.model.Owner;
import com.example.petclinic.model.Vet;
import com.example.petclinic.services.OwnerService;
import com.example.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

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
        owner1.setFirstName("Peter");
        owner1.setLastName("Pan");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Jar-jar");
        owner2.setLastName("Binks");
        ownerService.save(owner2);

        System.out.println("Bootstrapping owner data");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sith");
        vet1.setLastName("Lord");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Barbara");
        vet2.setLastName("Kowalska");
        vetService.save(vet2);

        System.out.println("Bootstrapping vet data");
    }
}
