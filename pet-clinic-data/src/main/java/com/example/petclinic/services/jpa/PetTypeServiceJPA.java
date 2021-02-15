package com.example.petclinic.services.jpa;


import com.example.petclinic.model.PetType;
import com.example.petclinic.repositories.PetTypeRepository;
import com.example.petclinic.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Profile("jpa")
@Transactional
public class PetTypeServiceJPA extends AbstractJpaService<PetType, PetTypeRepository> implements PetTypeService {

    public PetTypeServiceJPA(PetTypeRepository repository) {
        super(repository);
    }
}
