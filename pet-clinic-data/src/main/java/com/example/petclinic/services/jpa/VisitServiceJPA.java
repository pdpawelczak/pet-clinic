package com.example.petclinic.services.jpa;

import com.example.petclinic.model.Visit;
import com.example.petclinic.repositories.VisitRepository;
import com.example.petclinic.services.VisitService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class VisitServiceJPA extends AbstractJpaService<Visit, VisitRepository> implements VisitService {

    public VisitServiceJPA(VisitRepository repository) {
        super(repository);
    }
}
