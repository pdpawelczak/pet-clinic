package com.example.petclinic.services.jpa;

import com.example.petclinic.model.Owner;
import com.example.petclinic.repositories.OwnerRepository;
import com.example.petclinic.services.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Profile("jpa")
@Transactional
public class OwnerServiceJPA extends AbstractJpaService<Owner, OwnerRepository> implements OwnerService {

    public OwnerServiceJPA(OwnerRepository repository) {
        super(repository);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return repository.findByLastName(lastName);
    }
}
