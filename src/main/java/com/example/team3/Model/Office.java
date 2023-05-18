package com.example.team3.Model;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Office {
    @Id
    @Column
    private String userId;

    @Column
    private String password;

    @Column
    private String userName;

    @Column
    private String userEmail;

    @Column
    private String userPhone;
}
