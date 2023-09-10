package com.postgresexample.postgresexample.mappers.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.postgresexample.postgresexample.Modal.WeatherEntity;
import com.postgresexample.postgresexample.Modal.dto.WeatherDto;
import com.postgresexample.postgresexample.mappers.Mapper;

@Component
public class WeatherMapper implements Mapper<WeatherEntity, WeatherDto> {

    private ModelMapper modelMapper;

    public WeatherMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public WeatherDto mapTo(WeatherEntity weatherEntity) {
        return modelMapper.map(weatherEntity, WeatherDto.class);
    }

    @Override
    public WeatherEntity mapFrom(WeatherDto weatherDto) {
        return modelMapper.map(weatherDto, WeatherEntity.class);
    }
}
