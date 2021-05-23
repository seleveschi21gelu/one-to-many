package com.example.onetomany2.controller;

import com.example.onetomany2.entity.City;
import com.example.onetomany2.entity.Country;
import com.example.onetomany2.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/country")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping()
    public List<Country> getAll() {
        return countryService.getAll();
    }

    @GetMapping("/{id}")
    public Country getById(@PathVariable int id) {
        return countryService.getById(id);
    }

    @PostMapping()
    public Country add(@RequestBody Country country) {
        return countryService.addOrUpdate(country);
    }

    @PutMapping("/{id}")
    public Country update(@RequestBody Country country, @PathVariable int id) {
        country.setCountryId(id);
        return countryService.addOrUpdate(country);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        countryService.deleteById(id);
    }

    @GetMapping("/list")
    public List<Country> getCountries() {
        return countryService.getAllCountries();

    }


}
