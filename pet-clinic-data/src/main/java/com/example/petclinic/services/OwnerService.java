package com.example.petclinic.services;


import com.example.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner>{

    Owner findByLastName(String lastName);
}
