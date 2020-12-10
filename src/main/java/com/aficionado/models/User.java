package com.aficionado.models;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import java.util.Date;

@Entity
public class User {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;

	@NotEmpty(message = "please provide a password")
	private String password;

	@CreationTimestamp
	private Date joinedAt;

	@NotEmpty(message = "please provide a first name")
	public String firstName;

	@NotEmpty(message = "please provide a last name")
	public String lastName;

	@NotEmpty(message = "please provide a user name")
	@Pattern(regexp="[^\\s]+", message="Your username cannot contain spaces")
	public String userName;

	@NotEmpty
	@Email(message = "please provide a valid email")
	public String email;

	private int active;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"))
	
	public String imageUrl;


	public Double waist;


	public Double chest;


	public Double inseam;

	public User() {
	}

	public User(Date joinedAt, @NotEmpty(message = "please provide a first name") String firstName, @NotEmpty(message = "please provide a last name") String lastName, @NotEmpty(message = "please provide a user name") @Pattern(regexp = "[^\\s]+", message = "Your username cannot contain spaces") String userName, @NotEmpty @Email(message = "please provide a valid email") String email, String imageUrl, Double waist, Double chest, Double inseam) {
		this.joinedAt = joinedAt;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.email = email;
		this.imageUrl = imageUrl;
		this.waist = waist;
		this.chest = chest;
		this.inseam = inseam;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public Date getJoinedAt() {
		return joinedAt;
	}

	public void setJoinedAt(Date joinedAt) {
		this.joinedAt = joinedAt;
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Double getWaist() {
		return waist;
	}

	public void setWaist(Double waist) {
		this.waist = waist;
	}

	public Double getChest() {
		return chest;
	}

	public void setChest(Double chest) {
		this.chest = chest;
	}

	public Double getInseam() {
		return inseam;
	}

	public void setInseam(Double inseam) {
		this.inseam = inseam;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User{" +
				"Id=" + Id +
				", joinedAt=" + joinedAt +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", userName='" + userName + '\'' +
				", email='" + email + '\'' +
				", imageUrl='" + imageUrl + '\'' +
				", waist=" + waist +
				", chest=" + chest +
				", inseam=" + inseam +
				'}';
	}
}

//set User as an entity and name table
//@Entity
//@Table(name="users")
//public class User {
//	// set Id as primary key, randomly generate it and name column
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	//@Column(name="user_id")
//	private Long userId;
//	//fields and validation messages
//	@Email(message = "Please provide a valid email")
//	@NotEmpty(message = "Please provide an email")
//	private String email;
//
//	@NotEmpty(message = "Please provide a username")
//	@Length(min = 3, message = "Your username must have at least 3 characters")
//	@Length(max = 15, message = "Your username cannot have more than 15 characters")
//	@Pattern(regexp = "[^\\s]+", message = "Your username cannot contain spaces")
//	private String username;
//
//	@Length(min = 5, message = "Your password must have at least 5 characters")
//	@NotEmpty(message = "Please provide a password")
//	@JsonProperty(access = Access.WRITE_ONLY)
//	private String password;
//
//	@NotEmpty(message = "Please provide your first name")
//    private String firstName;
//
//    @NotEmpty(message = "Please provide your last name")
//    private String lastName;
//
//    private String imageUrl;
//    //link to userMeasurements table
//    @OneToOne(cascade = CascadeType.ALL)
//    //@JoinColumn(name = "user_measurements_id", referencedColumnName = "user_id")
//    private UserMeasurements userMeasurements;
//    //getters and setters for all fields except id
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public String getUsername() {
//		return username;
//	}
//
//	public void setUsername(String username) {
//		this.username = username;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//	public String getFirstName() {
//		return firstName;
//	}
//
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
//
//	public String getLastName() {
//		return lastName;
//	}
//
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}
//
//	public String getImageUrl() {
//		return imageUrl;
//	}
//
//	public void setImageUrl(String imageUrl) {
//		this.imageUrl = imageUrl;
//	}
//
//	public UserMeasurements getUserMeasurements() {
//		return userMeasurements;
//	}
//
//	public void setUserMeasurements(UserMeasurements userMeasurements) {
//		this.userMeasurements = userMeasurements;
//	}
//
//
//}
//
//
