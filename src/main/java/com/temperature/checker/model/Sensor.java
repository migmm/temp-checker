package com.temperature.checker.model;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Document(value = "temprecords")
@Data
public class Sensor {
    @Id
    private String id;
    private String temperature;
    private String humidity;
    private String pressure;
    private Boolean rain;
    private Integer light;
    private Integer charge;
    private Boolean charging;

    @CreatedDate
    private Instant created;

}
