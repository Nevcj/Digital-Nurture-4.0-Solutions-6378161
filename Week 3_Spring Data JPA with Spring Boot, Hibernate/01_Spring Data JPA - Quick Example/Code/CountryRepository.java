package com.cognizant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cognizant.model.Country;

public interface CountryRepository extends JpaRepository<Country, String> {

}