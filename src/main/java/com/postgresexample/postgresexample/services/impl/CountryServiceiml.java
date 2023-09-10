package com.postgresexample.postgresexample.services.impl;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.stereotype.Service;

import com.postgresexample.postgresexample.Modal.CountryEntity;
import com.postgresexample.postgresexample.respositories.CountryRepository;
import com.postgresexample.postgresexample.services.CountryService;

@Service
public class CountryServiceiml implements CountryService {
    private CountryRepository countryRepository;

    public CountryServiceiml(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public CountryEntity createCountry(int id, CountryEntity countryEntity) {
        countryEntity.setId(id);
        return countryRepository.save(countryEntity);

    }

    public List<CountryEntity> findAll() {
        return StreamSupport.stream(countryRepository.findAll().spliterator(), false).collect(Collectors.toList());
    }
}
