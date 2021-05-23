package com.example.onetomany2.service;

import com.example.onetomany2.entity.City;
import com.example.onetomany2.entity.Country;
import com.example.onetomany2.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

@Service
public class CityService {

    @Autowired
    private CityRepository cityRepository;

    public City addOrUpdate(City city) {
        return cityRepository.save(city);

    }

    public boolean deleteById(int id) {
        cityRepository.deleteById(id);
        return true;
    }

    public List<City> getAll() {
        cityRepository.saveAll(cities);
        return cityRepository.findAll();
    }

    public City getById(int id) {
        return cityRepository.findById(id).orElseThrow(() -> new RuntimeException("We have an exception"));
    }

    static List<City> cities = new Vector<>();

    static {
        cities.add(new City(1, "Cluj-Napoca"));
        cities.add(new City(2, "London"));
        cities.add(new City(3, "Moscow"));
        cities.add(new City(4, "Paris"));

    }

}
