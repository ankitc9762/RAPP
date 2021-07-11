package com.rapp.controller;


import com.rapp.model.response.NonVaccinatedUser;
import com.rapp.service.VaccinatedUsersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class NonVaccinatedUsersController {


    private final VaccinatedUsersServiceImpl vaccinatedUsersService;

    @Autowired
    public NonVaccinatedUsersController(VaccinatedUsersServiceImpl vaccinatedUsersService) {
        this.vaccinatedUsersService = vaccinatedUsersService;
    }

    @GetMapping("/nonVaccinatedUsers/{zipCode}")
    public List<NonVaccinatedUser> getNonVaccinatedUsersFromZipCode(@PathVariable int zipCode) {
        return vaccinatedUsersService.findUsers(zipCode);

    }
}
