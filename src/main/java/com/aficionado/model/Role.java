package com.aficionado.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "ROLE")
public class Role {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column (name = "role_id")
	private Long roleId;
	private String role;
	
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
	    this.role = role;
	}

	public Long getId() {
	    return id;
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", role=" + role + "]";
	}
}
