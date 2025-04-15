package com.dukorane.Dukorane_backend.model;


import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Table(name= "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private UUID id;
    private String fullName;

    @Column(unique = true)
    private String phoneNumber;
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;
    private String location;
    private String profilePicture;
    private Timestamp createdAt;

}
