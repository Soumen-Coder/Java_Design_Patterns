package com.soumen.creational.builder;

import java.time.LocalDate;

public class Client {
    public static void main(String[] args) {
        User user = createUser();

        UserDTOBuilder builder = new UserWebDTOBuilder();
        UserDTO dto = directBuild(builder, user);
        System.out.println(dto);

    }

    private static UserDTO directBuild(UserDTOBuilder builder, User user){
        return builder.withFirstName(user.getFirstName()).withLastName(user.getLastName())
                .withAddress(user.getAddress())
                .withAge(user.getAge())
                .build();
        }


    public static User createUser(){
        User user = new User();
        Address address = new Address();
        address.setHouseNumber("00000");
        address.setCity("CEG");
        address.setState("AEC");
        address.setCountry("FAC");

        user.setFirstName("Soumen");
        user.setLastName("Roy");
        user.setAge(LocalDate.of(1960,5,6));
        user.setAddress(address);

        return user;
    }
}
