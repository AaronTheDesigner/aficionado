package com.aficionado.models;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Date;
//import java.util.List;
import java.util.Map;
import java.util.Set;


@Entity
@Table(name="users")
public class User implements UserDetails {

	// UserDetails requires these, they are technically getters (is-ers?) overridden by Lombok.
	// @Transient Makes it so these aren't persisted in the database, as they are hard coded.
	@Transient
	private final boolean accountNonExpired = true;
	@Transient
	private boolean accountNonLocked = true;
	@Transient
	private boolean credentialsNonExpired = true;
	@Transient
	private boolean enabled = true;
	@Transient
	private Collection<GrantedAuthority> authorities = null;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private Long id;

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

	private int active;

	@CreationTimestamp
	private Date createdAt;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Role> roles;

	@ElementCollection
	private Map<Product, Integer> cart;

	//@NotEmpty(message = "Please provide your waist measurement in inches")
    private double waist;

	//@NotEmpty(message = "Please provide your chest measurement in inches")
    private double chest;

	//@NotEmpty(message = "Please provide your inseam measurement in inches")
    private double inseam;

	public User() {
	}

	public User(Long id, @Email(message = "Please provide a valid email") @NotEmpty(message = "Please provide an email") String email, @NotEmpty(message = "Please provide a username") @Length(min = 3, message = "Your username must have at least 3 characters") @Length(max = 15, message = "Your username cannot have more than 15 characters") @Pattern(regexp = "[^\\s]+", message = "Your username cannot contain spaces") String username, @Length(min = 5, message = "Your password must have at least 5 characters") @NotEmpty(message = "Please provide a password") String password, @NotEmpty(message = "Please provide your first name") String firstName, @NotEmpty(message = "Please provide your last name") String lastName, int active, Date createdAt, Set<Role> roles, Map<Product, Integer> cart, double waist, double chest, double inseam) {
		this.id = id;
		this.email = email;
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.active = active;
		this.createdAt = createdAt;
		this.roles = roles;
		this.cart = cart;
		this.waist = waist;
		this.chest = chest;
		this.inseam = inseam;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	@Override
	public boolean isAccountNonExpired() {
		return false;
	}

	@Override
	public boolean isAccountNonLocked() {
		return false;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return false;
	}

	@Override
	public boolean isEnabled() {
		return false;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return null;
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

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public Map<Product, Integer> getCart() {
		return cart;
	}

	public void setCart(Map<Product, Integer> cart) {
		this.cart = cart;
	}

	public double getWaist() {
		return waist;
	}

	public void setWaist(double waist) {
		this.waist = waist;
	}

	public double getChest() {
		return chest;
	}

	public void setChest(double chest) {
		this.chest = chest;
	}

	public double getInseam() {
		return inseam;
	}

	public void setInseam(double inseam) {
		this.inseam = inseam;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", email='" + email + '\'' +
				", username='" + username + '\'' +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", active=" + active +
				", createdAt=" + createdAt +
				", roles=" + roles +
				", cart=" + cart +
				", waist=" + waist +
				", chest=" + chest +
				", inseam=" + inseam +
				'}';
	}
}
