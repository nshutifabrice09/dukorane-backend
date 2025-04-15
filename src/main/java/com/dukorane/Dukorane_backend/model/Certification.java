package com.dukorane.Dukorane_backend.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "certifications")
public class Certification {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "tvet_id")
    private TVETInstitution tvet;

    private String title;
    private LocalDate issueDate;
    private String fileUrl;
}
