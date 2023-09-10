package com.postgresexample.postgresexample.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.postgresexample.postgresexample.Modal.CountryEntity;

@Service
public interface CountryService {
    CountryEntity createCountry(String id,CountryEntity country);
    
    List<CountryEntity> findAll();
    
}
