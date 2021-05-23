package com.example.onetomany2.service;

import com.example.onetomany2.entity.Country;
import com.example.onetomany2.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.LinkedList;
import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public Country addOrUpdate(Country country) {
        return countryRepository.save(country);
    }

    public boolean deleteById(int id) {
        countryRepository.deleteById(id);
        return true;
    }

    public List<Country> getAll() {
        return countryRepository.findAll();
    }

    public Country getById(int id) {
        return countryRepository.findById(id).orElseThrow(() -> new RuntimeException("We had a problem in Country"));
    }

    private static List<Country> countryList = new LinkedList<>();

    static {
        new CountryService().countryList.add(new Country(1, "Romania"));
        new CountryService().countryList.add(new Country(2, "England"));
        new CountryService().countryList.add(new Country(3, "Russia"));
        new CountryService().countryList.add(new Country(4, "France"));
    }

    public List<Country>getAllCountries(){
       return countryRepository.saveAll(countryList);
    }




}
