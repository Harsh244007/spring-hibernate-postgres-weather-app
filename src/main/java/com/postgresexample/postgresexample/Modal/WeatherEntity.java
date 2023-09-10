package com.postgresexample.postgresexample.Modal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
// import jakarta.persistence.CascadeType;
// import jakarta.persistence.JoinColumn;
// import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name ="weather2")
public class WeatherEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "weather2_id_deq")
    private Long id;
    
    // @ManyToOne(cascade = CascadeType.ALL)
    // @JoinColumn(name="country_id")
    // private CountryEntity country;
    
    private String country;
    private String city;
}
