package com.postgresexample.postgresexample.controller;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.postgresexample.postgresexample.Modal.CountryEntity;
import com.postgresexample.postgresexample.Modal.dto.CountryDto;
import com.postgresexample.postgresexample.mappers.Mapper;
import com.postgresexample.postgresexample.services.impl.CountryServiceiml;

@RestController
@RequestMapping(value={"/weather/country","/weather/country/"})
public class CountryControler {
    
     private CountryServiceiml countryServices;
    private Mapper<CountryEntity,CountryDto> countryMapper;

    public CountryControler(CountryServiceiml countryServices,Mapper<CountryEntity,CountryDto> countryMapper){
        this.countryServices=countryServices;
        this.countryMapper=countryMapper;
    }

    @PostMapping("{id}")
    public CountryDto createCountry(@PathVariable("id") String id,@RequestBody CountryDto country){
    CountryEntity countryEntity= countryMapper.mapFrom(country);
        CountryEntity savedCountryEntity = countryServices.createCountry(id, countryEntity);
        return countryMapper.mapTo(savedCountryEntity);
    }

    
    @GetMapping("")
    public List<CountryDto> listAllCountries(){
        List<CountryEntity> countries=countryServices.findAll();
        return countries.stream().map(countryMapper::mapTo).collect(Collectors.toList());
    }
}
