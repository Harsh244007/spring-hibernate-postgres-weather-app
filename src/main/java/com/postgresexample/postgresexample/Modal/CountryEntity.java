package com.postgresexample.postgresexample.Modal;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name ="country")
public class CountryEntity {

    // @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "country_id_seq")
    @Id
    private int id;
    
    // @ManyToOne(cascade = CascadeType.ALL)
    // @JoinColumn(name="country_id")
    // private WeatherEntity country;
    private String country;

}
