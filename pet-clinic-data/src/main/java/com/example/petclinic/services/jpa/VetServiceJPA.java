package com.example.petclinic.services.jpa;


import com.example.petclinic.model.Vet;
import com.example.petclinic.repositories.VetRepository;
import com.example.petclinic.services.VetService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class VetServiceJPA extends AbstractJpaService<Vet, VetRepository> implements VetService {

    public VetServiceJPA(VetRepository repository) {
        super(repository);
    }


}
