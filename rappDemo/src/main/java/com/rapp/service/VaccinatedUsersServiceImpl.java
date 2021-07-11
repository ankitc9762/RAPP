package com.rapp.service;

import com.rapp.model.response.NonVaccinatedUser;
import com.rapp.repository.AllUsersListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VaccinatedUsersServiceImpl implements VaccinatedUserService{

    private final AllUsersListRepository allUsersListRepository;

    @Autowired
    public VaccinatedUsersServiceImpl( AllUsersListRepository allUsersListRepository) {
        this.allUsersListRepository = allUsersListRepository;
    }


    public List<NonVaccinatedUser> findUsers(int zipCode){
        return allUsersListRepository.findAllByZipCode(zipCode);


    }

}
