package com.example.onetomany2.controller;

import com.example.onetomany2.entity.City;
import com.example.onetomany2.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/city")
public class CityController {

    @Autowired
    private CityService cityService;

    @GetMapping("/{id}")
    private City getById(@PathVariable int id) {
        return cityService.getById(id);
    }

    @GetMapping
    private List<City> getById() {
        return cityService.getAll();
    }

    @PostMapping()
    private City add(@RequestBody City city) {
        return cityService.addOrUpdate(city);
    }

    @PutMapping
    private City update(@PathVariable int id, @RequestBody City city) {
        city.setCityId(id);
        return cityService.addOrUpdate(city);
    }
    @DeleteMapping("/{id}")
    private void delete(@PathVariable int id){
       cityService.deleteById(id);
    }
}
