package com.dukorane.Dukorane_backend.model;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Table(name = "applications")
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "gig_id")
    private Gig gig;

    @ManyToOne
    @JoinColumn(name = "worker_id")
    private WorkerProfile worker;

    private String message;

    @Enumerated(EnumType.STRING)
    private ApplicationStatus status;

    private Timestamp appliedAt;
}
