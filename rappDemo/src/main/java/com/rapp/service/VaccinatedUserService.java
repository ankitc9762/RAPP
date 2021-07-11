package com.rapp.service;

import com.rapp.model.response.NonVaccinatedUser;

import java.util.List;

public interface VaccinatedUserService {

     List<NonVaccinatedUser> findUsers(int zipCode);

}
