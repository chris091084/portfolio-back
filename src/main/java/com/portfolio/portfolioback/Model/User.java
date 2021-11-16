package com.portfolio.portfolioback.Model;

import java.time.ZonedDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import com.sun.istack.NotNull;

@Entity
public class User {
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
	@NotBlank
    private String firstname;
    @NotNull
	@NotBlank
    private String name;
	@NotNull
    private ZonedDateTime birthday;
	@NotNull
	@NotBlank
    private String adress;
	@NotNull
	@NotBlank
    private String city;
    private String phoneNumber;
    
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public void setName(String name) {
		this.name = name;
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
