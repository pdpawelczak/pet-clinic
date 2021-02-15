package com.example.petclinic.services.jpa;

import com.example.petclinic.model.Pet;
import com.example.petclinic.repositories.PetRepository;
import com.example.petclinic.services.PetService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PetServiceJPA extends AbstractJpaService<Pet, PetRepository> implements PetService {

    public PetServiceJPA(PetRepository repository) {
        super(repository);
    }
}
