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
	@NotBlank
	private String email;
	@NotNull
    private ZonedDateTime birthday;
	@NotNull
	@NotBlank
    private String adress;
	@NotNull
	@NotBlank
    private String city;
    private String phoneNumber;
	private String password;
	private String role;
	private boolean Active;


	public User(String firstname, String name, String email, ZonedDateTime birthday, String adress, String city, String phoneNumber, String password, String role, boolean active) {
		this.firstname = firstname;
		this.name = name;
		this.email = email;
		this.birthday = birthday;
		this.adress = adress;
		this.city = city;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.role = role;
		Active = active;
	}

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
	public String getEmail() {return email;}
	public void setEmail(String email) {this.email = email;}
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
	public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;}
	public String getPassword() {return password;}
	public void setPassword(String password) {this.password = password;}
	public String getRole() {return role;}
	public void setRole(String role) {this.role = role;}
	public boolean isActive() {
		return Active;
	}
	public void setActive(boolean active) {
		Active = active;
	}

}
