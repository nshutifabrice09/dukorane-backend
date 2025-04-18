package com.dukorane.Dukorane_backend.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "tvet_institutions")
public class TVETInstitution {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String name;
    private String location;

    public TVETInstitution() {
    }

    public TVETInstitution(UUID id, User user, String name, String location) {
        this.id = id;
        this.user = user;
        this.name = name;
        this.location = location;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
