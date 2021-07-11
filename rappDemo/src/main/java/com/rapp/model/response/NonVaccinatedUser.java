package com.rapp.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NonVaccinatedUser {

    private static final Long  serialVersionUID = 1L ;

    @JsonProperty(value = "vaccinated_user_id")
    Integer vaccinatedUserId;

    @JsonProperty(value = "zipCode")
    Integer zipCode;

    @JsonProperty(value = "vaccinated")
    String isVaccinated;

    String firstName;

    String lastName;
}
