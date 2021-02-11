package com.example.petclinic.bootstrap;

import com.example.petclinic.model.Owner;
import com.example.petclinic.model.Pet;
import com.example.petclinic.model.PetType;
import com.example.petclinic.model.Vet;
import com.example.petclinic.services.OwnerService;
import com.example.petclinic.services.PetTypeService;
import com.example.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

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
        petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Peter");
        owner1.setLastName("Pan");
        owner1.setAddress("Wojska polskiego 42");
        owner1.setCity("Katowice");
        owner1.setTelephone("128371782");

        Pet peterPet = new Pet();
        peterPet.setPetType(cat);
        peterPet.setOwner(owner1);
        peterPet.setBirthDate(LocalDate.now());
        peterPet.setName("Sisi");
        owner1.getPets().add(peterPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Jar-jar");
        owner2.setLastName("Binks");
        owner2.setAddress("Wojska polskiego 42");
        owner2.setCity("Sosnowiec");
        owner2.setTelephone("128371782");

        Pet jarPet = new Pet();
        jarPet.setPetType(dog);
        jarPet.setOwner(owner2);
        jarPet.setBirthDate(LocalDate.now());
        jarPet.setName("Doggo");
        owner2.getPets().add(jarPet);

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
