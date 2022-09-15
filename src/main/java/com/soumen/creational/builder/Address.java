package com.soumen.creational.builder;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class Address {
    private String houseNumber;
    private String city;
    private String state;
    private String zipCode;
    private String country;
}
