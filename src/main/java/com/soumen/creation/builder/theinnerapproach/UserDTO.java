package com.soumen.creation.builder.theinnerapproach;

import com.soumen.creational.builder.Address;
import java.time.LocalDate;
import java.time.Period;

//Product class, immutable but builder pattern will take care of the creation of object from this class
public class UserDTO {

    private String age;
    private String name;
    private String address;

    public String getName(){
        return this.name;
    }

    public String getAge(){
        return this.age;
    }

    public String getAddress(){
        return this.address;
    }

    private void setName(String name){
        this.name=name;
    }

    private void setAge(String age){
        this.age=age;
    }

    private void setAddress(String address){
        this.address=address;
    }

    @Override
    public String toString() {
        return "name=" + name + "\nage=" + age + "\naddress=" + address ;
    }
    //Get builder instance
    public static UserDTOBuilder getBuilder() {
        return new UserDTOBuilder();
    }

    public static class UserDTOBuilder{
        private String fname;
        private String lname;
        private String age;
        private String address;
        private UserDTO dto;

        public UserDTOBuilder(){

        }

        public UserDTOBuilder withFirstName(String fname){
            this.fname = fname;
            return this;
        }
        public UserDTOBuilder withLastName(String lname){
            this.lname = lname;
            return this;
        }
        public UserDTOBuilder withAddress(Address address){
            this.address = address.getHouseNumber()+"\n"+address.getCity()+
                           "/n"+address.getState()+
                           "/n"+address.getCountry();
            return this;
        }
        public UserDTOBuilder withAge(LocalDate age){
            Period ageInYears = Period.between(LocalDate.now(), age);
            this.age = Integer.toString(ageInYears.getYears());
            return this;
        }
        public UserDTO build(){
            this.dto = new UserDTO();
            dto.setAddress(address);
            dto.setName(fname+" "+lname);
            dto.setAge(age);
            return this.dto;
        }
        public UserDTO getUserDTO(){
            return this.dto;
        }
    }
}
