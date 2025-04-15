package com.dukorane.Dukorane_backend.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name="workprofiles")
public class WorkerProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private UUID id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    private int yearsOfExperience;

    @ElementCollection
    private List<String> languageSpoken;

    @ElementCollection
    private List<String> serviceAreas;

    private boolean verifiedByTvet;

    private double reputationScore;
}
