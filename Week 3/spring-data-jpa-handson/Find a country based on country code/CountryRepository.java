package com.example.repository;

import com.example.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
    Country findByCountryCode(String countryCode);
}
