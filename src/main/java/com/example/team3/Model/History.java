package com.example.team3.Model;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class History {
    @Id
    @Column
    private Long histroyId;

    @Column
    private String officerId;

    @Column
    private Long outputId;

    @Column
    private Long diseaseId;

    @Column
    private String care;

    @Column
    private String prevent;

    @Column
    private LocaldateTime createDate;
}
