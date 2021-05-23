package com.example.onetomany2.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Entity
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cityId;

    private String name;

//    private List<Country> list;

//    public City(int cityId, String name, List<Country> countryList) {
//        this.cityId = cityId;
//        this.name = name;
//        this.list = countryList;
//    }
//
//    public List<Country> getList() {
//        return list;
//    }
//
//    public void setList(List<Country> list) {
//        this.list = list;
//    }

    public City(int cityId, String name) {
        this.cityId = cityId;
        this.name = name;
    }

    public City() {
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
