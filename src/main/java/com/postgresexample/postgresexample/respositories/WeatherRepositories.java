package com.postgresexample.postgresexample.respositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.postgresexample.postgresexample.Modal.WeatherEntity;

@Repository
public interface WeatherRepositories extends CrudRepository<WeatherEntity,String> {
    
}
