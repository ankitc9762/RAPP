package com.rapp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "vaccinatedUsers")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class VaccinatedUsersEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "vaccinated")
    private int isVaccinated;


}
