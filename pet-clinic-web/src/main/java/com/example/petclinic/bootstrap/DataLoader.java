package com.example.petclinic.bootstrap;

import com.example.petclinic.model.Owner;
import com.example.petclinic.model.Vet;
import com.example.petclinic.services.OwnerService;
import com.example.petclinic.services.VetService;
import com.example.petclinic.services.map.OwnerServiceMap;
import com.example.petclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Peter");
        owner1.setLastName("Pan");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Jar-jar");
        owner2.setLastName("Binks");
        ownerService.save(owner2);

        System.out.println("Bootstrapping owner data");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sith");
        vet1.setLastName("Lord");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Barbara");
        vet2.setLastName("Kowalska");
        vetService.save(vet2);

        System.out.println("Bootstrapping vet data");
    }
}
