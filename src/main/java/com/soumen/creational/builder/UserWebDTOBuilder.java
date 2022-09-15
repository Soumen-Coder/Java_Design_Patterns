package com.soumen.creational.builder;

import java.time.LocalDate;
import java.time.Period;


public class UserWebDTOBuilder implements UserDTOBuilder {
    private String firstName;
    private String lastName;
    private String address;
    private String age;
    private UserDTO dto;

    @Override
    public UserDTOBuilder withFirstName(String fname) {
        this.firstName = fname;
        return this;
    }

    @Override
    public UserDTOBuilder withLastName(String lname) {
        this.lastName = lname;
        return this;
    }

    @Override
    public UserDTOBuilder withAddress(Address address) {
        this.address = address.getHouseNumber() +", " + address.getCountry()
                +"\n" + address.getCity() +"\n"+address.getState()+" "+address.getZipCode();
        return this;
    }

    @Override
    public UserDTOBuilder withAge(LocalDate date) {
        Period ageInYears = Period.between(date, LocalDate.now());
        this.age = Integer.toString(ageInYears.getYears());
        return this;
    }

    @Override
    public UserDTO build() {
        dto =  new UserWebDTO(firstName + " " + lastName, address, age);
        return dto;
    }

    @Override
    public UserDTO getUserDTO() {
        return dto;
    }
}
