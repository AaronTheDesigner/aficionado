package com.aficionado.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "measurements")
public class UserMeasurements {
	// set Id as primary key, randomly generate it and name column
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_measurements_id")
	private Long userMeasurementsId;
	
	@NotEmpty(message = "Please provide your waist measurement in inches")
    private double waist;
	
	@NotEmpty(message = "Please provide your chest measurement in inches")
    private double chest;
	
	@NotEmpty(message = "Please provide your inseam measurement in inches")
    private double inseam;
	
	@OneToOne(mappedBy = "measurements")
	private User user;

	public Long getUserMeasurementsId() {
		return userMeasurementsId;
	}

	public void setUserMeasurementsId(Long userMeasurementsId) {
		this.userMeasurementsId = userMeasurementsId;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
