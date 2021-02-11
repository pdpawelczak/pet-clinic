package com.example.petclinic.services.map;

import com.example.petclinic.model.Owner;
import com.example.petclinic.services.OwnerService;
import org.springframework.stereotype.Service;

@Service
public class OwnerServiceMap extends  AbstractMapService<Owner> implements OwnerService {

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
