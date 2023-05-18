package com.example.team3.Model;

import lombok.*;

import javax.persistence.*;

@Entity
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "fishtank")
public class Fishtank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tankId;

    @Column(name = "userId", nullable = false)
    private String userId;

    @Column(name = "tankNum", nullable = false)
    private String tankNum;
}
