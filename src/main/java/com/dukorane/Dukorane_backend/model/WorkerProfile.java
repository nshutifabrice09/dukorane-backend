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

    public WorkerProfile() {
    }

    public WorkerProfile(UUID id, User user, int yearsOfExperience, List<String> languageSpoken, List<String> serviceAreas, boolean verifiedByTvet, double reputationScore) {
        this.id = id;
        this.user = user;
        this.yearsOfExperience = yearsOfExperience;
        this.languageSpoken = languageSpoken;
        this.serviceAreas = serviceAreas;
        this.verifiedByTvet = verifiedByTvet;
        this.reputationScore = reputationScore;
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

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public List<String> getLanguageSpoken() {
        return languageSpoken;
    }

    public void setLanguageSpoken(List<String> languageSpoken) {
        this.languageSpoken = languageSpoken;
    }

    public List<String> getServiceAreas() {
        return serviceAreas;
    }

    public void setServiceAreas(List<String> serviceAreas) {
        this.serviceAreas = serviceAreas;
    }

    public boolean isVerifiedByTvet() {
        return verifiedByTvet;
    }

    public void setVerifiedByTvet(boolean verifiedByTvet) {
        this.verifiedByTvet = verifiedByTvet;
    }

    public double getReputationScore() {
        return reputationScore;
    }

    public void setReputationScore(double reputationScore) {
        this.reputationScore = reputationScore;
    }
}
