package com.example.team3.Model;

import jakarta.persistence.*;
import jdk.jfr.Timestamp;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "gptparam")
public class GPTParam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long inputId;

    @Column(name = "userId", nullable = false)
    private String userId;

    @Column(name = "elkTime")
    private LocalDateTime elkTime;

    @Column(name = "historyId")
    private Long historyId;

    @Column(name = "diseaseId")
    private Long diseaseId;

    @Column(name = "photoRef", nullable = false)
    private String photoRef;
}
