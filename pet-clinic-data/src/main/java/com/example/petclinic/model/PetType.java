package com.example.petclinic.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class PetType extends BaseEntity{

    private String name;

    @Override
    public String toString() {
        return name;
    }
}
