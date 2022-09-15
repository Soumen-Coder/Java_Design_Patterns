package com.soumen.creational.builder;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class User {
    private String firstName;
    private String lastName;
    private LocalDate age;
    private Address address;
}
