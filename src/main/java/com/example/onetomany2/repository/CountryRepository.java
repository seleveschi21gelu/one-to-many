package com.example.onetomany2.repository;

import com.example.onetomany2.entity.City;
import com.example.onetomany2.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepository extends JpaRepository<Country,Integer> {



}
