package com.portfolio.portfolioback.Dao;

import java.sql.Date;
import java.time.ZonedDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.print.attribute.standard.DateTimeAtCompleted;

import org.springframework.lang.NonNull;

@Entity
public class User {
    @Id
    private Long id;
    @NonNull
    private String firstname;
    @NonNull
    private String name;
    @NonNull
    private ZonedDateTime birthday;
    @NonNull
    private String adress;
    @NonNull
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
