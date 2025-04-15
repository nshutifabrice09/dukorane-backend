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
}
