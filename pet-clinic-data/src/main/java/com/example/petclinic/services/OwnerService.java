package com.example.petclinic.services;


import com.example.petclinic.model.Owner;

import java.util.List;

public interface OwnerService extends CrudService<Owner>{

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);
}
