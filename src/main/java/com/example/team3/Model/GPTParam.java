package com.example.team3.Model;

import jakarta.persistence.*;
import lombok.*;

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

    @Column(name = "elkTime", nullable = false)
    private String elkTime;

    @Column(name = "historyId", nullable = false)
    private String historyId;

    @Column(name = "diseaseId", nullable = false)
    private String diseaseId;

    @Column(name = "photoRef", nullable = false)
    private String photoRef;
}
