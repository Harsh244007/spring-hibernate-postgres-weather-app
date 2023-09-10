package com.postgresexample.postgresexample.Modal.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WeatherDto {
    private Long id;
    private String Country;
    private String City;
}
