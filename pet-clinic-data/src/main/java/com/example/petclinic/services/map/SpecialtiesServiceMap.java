package com.example.petclinic.services.map;

import com.example.petclinic.model.Speciality;
import com.example.petclinic.services.SpecialtiesService;
import org.springframework.stereotype.Service;

@Service
public class SpecialtiesServiceMap extends AbstractMapService<Speciality> implements SpecialtiesService {
}
