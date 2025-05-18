package com.dukorane.Dukorane_backend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@Builder
@Entity
@Table(name="worker_profiles")
@NoArgsConstructor
@AllArgsConstructor
public class WorkerProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
