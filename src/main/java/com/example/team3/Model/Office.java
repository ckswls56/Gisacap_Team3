package com.example.team3.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
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
