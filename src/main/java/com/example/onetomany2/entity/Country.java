package com.example.onetomany2.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int countryId;
    private String name;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "cId",referencedColumnName = "countryId")
    private List<City> cities;

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    public Country(int countryId, String name) {
        this.countryId = countryId;
        this.name = name;
    }

    public Country(int countryId, String name, List<City>cities) {
        this.countryId = countryId;
        this.name = name;
        this.cities = cities;
    }

    public Country() {
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
