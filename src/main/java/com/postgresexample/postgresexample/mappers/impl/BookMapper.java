package com.postgresexample.postgresexample.mappers.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.postgresexample.postgresexample.Modal.CountryEntity;
import com.postgresexample.postgresexample.Modal.dto.CountryDto;
import com.postgresexample.postgresexample.mappers.Mapper;

@Component
public class BookMapper implements Mapper<CountryEntity,CountryDto>{


     private ModelMapper modelMapper;

    public BookMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public CountryDto mapTo(CountryEntity country) {
        return modelMapper.map(country, CountryDto.class);
 }

    @Override
    public CountryEntity mapFrom(CountryDto country) {
         return modelMapper.map(country, CountryEntity.class);
   }

    

}
