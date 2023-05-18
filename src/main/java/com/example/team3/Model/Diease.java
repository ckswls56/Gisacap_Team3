package com.example.team3.Model;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Diease {
    @Id
    @Column
    private Long diseaseId;

    @Column
    private String krName;

    @Column
    private String enName;
}
