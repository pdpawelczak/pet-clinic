package com.example.petclinic.services.map;

import com.example.petclinic.model.Vet;
import com.example.petclinic.services.SpecialityService;
import com.example.petclinic.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default", "map"})
public class VetServiceMap extends AbstractMapService<Vet> implements VetService {

    private final SpecialityService specialityService;

    public VetServiceMap(SpecialityService specialityService) {
        this.specialityService = specialityService;
    }

    @Override
    public Vet save(Vet object) {
        object.getSpecialities().forEach(speciality -> {
            if(speciality.getId() == null){
                specialityService.save(speciality);
            }
        });
        return super.save(object);
    }
}
