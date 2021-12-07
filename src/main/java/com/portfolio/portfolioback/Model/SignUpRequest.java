package com.portfolio.portfolioback.Model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.ZonedDateTime;

public class SignUpRequest {
    
    @NotBlank
    @NotNull
    private String firstname;
    
    @NotBlank
    @NotNull
    private String name;
    
    @NotBlank
    @Email(message = "email should be valid")
    private String email;
    
    @NotNull
    @NotBlank
    private String password;
    private ZonedDateTime birthday;
    @NotNull
    @NotBlank
    private String adress;
    @NotNull
    @NotBlank
    private String city;
    private String phoneNumber;


    public SignUpRequest(String firstname, String name, String email, String password) {
        this.firstname = firstname;
        this.name = name;
        this.email = email;
        this.password = password;

    }



    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getName() {
        return name;
    }

    public void setName(String lastname) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ZonedDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(ZonedDateTime birthday) {
        this.birthday = birthday;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
