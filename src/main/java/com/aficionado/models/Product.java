package com.aficionado.models;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// set User as an entity and name table
@Entity
//@Table(name = "product")
public class Product {
    // set Id as primary key, randomly generate it and name column
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long productId;
    // fields
    public String name;
    private String color;
    private String fabric;
    private int buttons;
    private String breast;
    private String lining;
    private String lapel;
    private double price;

    public Product() {
    }

    public Product(Long productId, String color, String fabric, int buttons, String breast, String lining, String lapel, double price) {
        this.name = name;
    	this.productId = productId;
        this.color = color;
        this.fabric = fabric;
        this.buttons = buttons;
        this.breast = breast;
        this.lining = lining;
        this.lapel = lapel;
        this.price = price;
    }

    // getters and setters
    public Long getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
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

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                "' name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", fabric='" + fabric + '\'' +
                ", buttons=" + buttons +
                ", breast='" + breast + '\'' +
                ", lining='" + lining + '\'' +
                ", lapel='" + lapel + '\'' +
                ", price=" + price +
                '}';
    }
}
