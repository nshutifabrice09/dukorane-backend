package com.dukorane.Dukorane_backend.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "gigs")
public class Gig {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private UUID id;

    @ManyToOne
    @JoinColumn(name = "employer_id")
    private User employer;
    private String title;

    @Column(length = 2048)
    private String description;

    @ManyToOne
    @JoinColumn(name = "skill_required")
    private Skill skillRequired;

    private String location;

    @Enumerated(EnumType.STRING)
    private GigStatus status;

    private LocalDate deadline;

    public Gig() {
    }

    public Gig(UUID id, User employer, String title, String description, Skill skillRequired, String location, GigStatus status, LocalDate deadline) {
        this.id = id;
        this.employer = employer;
        this.title = title;
        this.description = description;
        this.skillRequired = skillRequired;
        this.location = location;
        this.status = status;
        this.deadline = deadline;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public User getEmployer() {
        return employer;
    }

    public void setEmployer(User employer) {
        this.employer = employer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Skill getSkillRequired() {
        return skillRequired;
    }

    public void setSkillRequired(Skill skillRequired) {
        this.skillRequired = skillRequired;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public GigStatus getStatus() {
        return status;
    }

    public void setStatus(GigStatus status) {
        this.status = status;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }
}
