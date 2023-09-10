package com.postgresexample.postgresexample.respositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.postgresexample.postgresexample.Modal.CountryEntity;

@Repository
public interface CountryRepository extends CrudRepository<CountryEntity,String> {
    
}
