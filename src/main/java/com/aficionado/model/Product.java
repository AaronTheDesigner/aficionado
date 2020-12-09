package com.aficionado.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// set User as an entity and name table
@Entity
@Table(name = "product")
public class Product {
	// set Id as primary key, randomly generate it and name column
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "product_id")
	private Long productId;
	// fields
	private List<String> color;
	private String fabric;
	private int buttons;
	private String breast;
	private String lining;
	private String lapel;
	private double price;

	// getters and setters
	public Long getProductId() {
		return productId;
	}

	public List<String> getColor() {
		return color;
	}

	public void setColor(List<String> color) {
		this.color = color;
	}

	public String getFabric() {
		return fabric;
	}

	public void setFabric(String fabric) {
		this.fabric = fabric;
	}

	public int getButtons() {
		return buttons;
	}

	public void setButtons(int buttons) {
		this.buttons = buttons;
	}

	public String getBreast() {
		return breast;
	}

	public void setBreast(String breast) {
		this.breast = breast;
	}

	public String getLining() {
		return lining;
	}

	public void setLining(String lining) {
		this.lining = lining;
	}

	public String getLapel() {
		return lapel;
	}

	public void setLapel(String lapel) {
		this.lapel = lapel;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
