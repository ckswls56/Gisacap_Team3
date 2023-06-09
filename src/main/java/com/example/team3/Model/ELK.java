package com.example.team3.Model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ELK {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long elkTime;

    @Column(name = "tankId", nullable = false)
    private String tankId;

    @Column(name = "elkId", nullable = false)
    private String elkId;

    @Column(name = "do2")
    private double do2;

    @Column(name = "turbidity")
    private double turbidity;

    @Column(name = "nh3")
    private double nh3;

    @Column(name = "temperature")
    private double temperature;
}
