package com.postgresexample.postgresexample.services;

import java.util.List;

import com.postgresexample.postgresexample.Modal.WeatherEntity;

public interface WeatherServices {
    WeatherEntity createWeather(WeatherEntity weather);

    List<WeatherEntity> findAll();
}
