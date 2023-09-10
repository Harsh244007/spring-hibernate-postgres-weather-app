package com.postgresexample.postgresexample.services.impl;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.stereotype.Service;

import com.postgresexample.postgresexample.Modal.WeatherEntity;
import com.postgresexample.postgresexample.respositories.WeatherRepositories;
import com.postgresexample.postgresexample.services.WeatherServices;

@Service
public class WeatherServiceiml implements WeatherServices {
    
    private WeatherRepositories weatherRepositories;

    public WeatherServiceiml(WeatherRepositories weatherRepositories) {
        this.weatherRepositories = weatherRepositories;
    }

    @Override
    public WeatherEntity createWeather(WeatherEntity weatherEntity){
        return weatherRepositories.save(weatherEntity);
    }

    @Override
    public List<WeatherEntity> findAll() {
        return StreamSupport.stream(weatherRepositories.findAll().spliterator(), false).collect(Collectors.toList());
    }
    
}
