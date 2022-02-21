package com.lorenagc.easycooking.model;

import javax.persistence.*;

@Entity
@Table(name="Ingredient")
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="Name", unique = true)
    private String name;

    @Column(name="Unit")
    private String unit;

    public Ingredient(){
    }

    public Ingredient(String name, String unit) {
        this.name = name;
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
