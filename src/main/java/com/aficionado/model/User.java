package com.aficionado.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

//set User as an entity and name table
@Entity
@Table(name = "users")
public class User {
	// set Id as primary key, randomly generate it and name column
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private Long userId;
	//fields and validation messages
	@Email(message = "Please provide a valid email")
	@NotEmpty(message = "Please provide an email")
	private String email;

	@NotEmpty(message = "Please provide a username")
	@Length(min = 3, message = "Your username must have at least 3 characters")
	@Length(max = 15, message = "Your username cannot have more than 15 characters")
	@Pattern(regexp = "[^\\s]+", message = "Your username cannot contain spaces")
	private String username;

	@Length(min = 5, message = "Your password must have at least 5 characters")
	@NotEmpty(message = "Please provide a password")
	@JsonProperty(access = Access.WRITE_ONLY)
	private String password;

	@NotEmpty(message = "Please provide your first name")
    private String firstName;

    @NotEmpty(message = "Please provide your last name")
    private String lastName;
    
    private String imageUrl;
    //link to userMeasurements table
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_measurements_id", referencedColumnName = "user_id")
    private UserMeasurements userMeasurements;
    //getters and setters for all fields except id
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public UserMeasurements getUserMeasurements() {
		return userMeasurements;
	}

	public void setUserMeasurements(UserMeasurements userMeasurements) {
		this.userMeasurements = userMeasurements;
	}
	
	
	}
	

