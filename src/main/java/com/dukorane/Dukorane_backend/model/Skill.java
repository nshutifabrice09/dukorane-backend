package com.dukorane.Dukorane_backend.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name="skills")
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private UUID id;

    private String name;
    private String category;

    public Skill() {
    }

    public Skill(UUID id, String name, String category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
