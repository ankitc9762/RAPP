package com.rapp.repository;

import com.rapp.model.UsersEntity;
import com.rapp.model.response.NonVaccinatedUser;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface AllUsersListRepository extends CrudRepository<UsersEntity, Integer> {


    @Query(value  = "select t.vaccinated_user_id as vaccinatedUserId, t.zipCode as zipCode, v.vaccinated as isVaccinated, t.first_name as firstName, t.last_name as lastName from vaccinatedUsers v left join userList t on t.vaccinated_user_id = v.id where zipCode like %?% and v.vaccinated = '0' limit 10", nativeQuery = true)
    List<NonVaccinatedUser> findAllByZipCode(int zipCode);

}
