package com.aficionado.models;
// import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// set User as an entity and name table
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product")
public class Product {
    // set Id as primary key, randomly generate it and name column
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;
    // fields

    private String name;
    private String imageUrl;
    private String color;
    private String fabric;
    public int quantity;
    private int buttons;
    private String breast;
    private String lining;
    private String lapel;
    private double price;
}
