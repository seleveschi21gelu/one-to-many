package com.example.onetomany2.repository;

import com.example.onetomany2.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City,Integer> {
}
