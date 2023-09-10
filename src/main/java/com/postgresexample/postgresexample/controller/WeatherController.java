package com.postgresexample.postgresexample.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.postgresexample.postgresexample.Modal.WeatherEntity;
import com.postgresexample.postgresexample.Modal.dto.WeatherDto;
import com.postgresexample.postgresexample.mappers.Mapper;
import com.postgresexample.postgresexample.services.WeatherServices;

@RestController
@RequestMapping(value={"/weather","/weather/"})
public class WeatherController {
 
    private WeatherServices weatherServices;
    private Mapper<WeatherEntity,WeatherDto> weatherMapper;

    public WeatherController(WeatherServices weatherServices,Mapper<WeatherEntity,WeatherDto> weatherMapper){
        this.weatherServices=weatherServices;
        this.weatherMapper=weatherMapper;
    }

    @CacheEvict(value = "weather", allEntries = true)
    @PostMapping("")
    public ResponseEntity<Object> createWeather(@RequestBody WeatherDto weather) {

        if (weather.getCountry() == null || weather.getCountry().isEmpty()) {
            String errorMessage = "Please provide a valid 'country' value in the request body.";
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessage);
        }

        if (weather.getCity() == null || weather.getCity().isEmpty()) {
            String errorMessage = "Please provide a valid 'city' value in the request body.";
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessage);
        }

        WeatherEntity weatherEntity = weatherMapper.mapFrom(weather);
        WeatherEntity savedWeatherEntity = weatherServices.createWeather(weatherEntity);
        WeatherDto responseCountryDto = weatherMapper.mapTo(savedWeatherEntity);
        return ResponseEntity.ok(responseCountryDto);
    }

    
    @Cacheable("weather")
    @GetMapping("")
    public List<WeatherDto> listAllWeather() {
        List<WeatherEntity> weathers = weatherServices.findAll();
        return weathers.stream().map(weatherMapper::mapTo).collect(Collectors.toList());
    }



}
