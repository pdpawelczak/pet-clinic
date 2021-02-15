package com.example.petclinic.services.jpa;

import com.example.petclinic.model.Speciality;
import com.example.petclinic.repositories.SpecialityRepository;
import com.example.petclinic.services.SpecialityService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Profile("jpa")
@Transactional
public class SpecialityServiceJPA extends AbstractJpaService<Speciality, SpecialityRepository> implements SpecialityService {

    public SpecialityServiceJPA(SpecialityRepository repository) {
        super(repository);
    }
}
