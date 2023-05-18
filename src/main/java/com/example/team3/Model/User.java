package com.example.team3.Model;

import lombok.*;

import javax.persistence.*;

@Entity
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long uid;

    @Column(name = "userId", nullable = false)
    private String userId;

    @Column(name = "userPwd", nullable = false)
    private String password;

    @Column(name = "userName", nullable = false)
    private String username;

    @Column(name = "userEmail")
    private String userEmail;

    @Column(name = "userPhone")
    private String userPhone;

    @Column(name = "registrationNum", nullable = false)
    private String registrationNum;
}