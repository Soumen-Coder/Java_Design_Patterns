package com.soumen.creational.builder;

import java.time.LocalDate;

public interface UserDTOBuilder {
    UserDTOBuilder withFirstName(String fname);
    UserDTOBuilder withLastName(String lname);
    UserDTOBuilder withAddress(Address address);
    UserDTOBuilder withAge(LocalDate date);
    UserDTO build();
    UserDTO getUserDTO();
}
