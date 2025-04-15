package com.dukorane.Dukorane_backend.model;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Table(name = "reviews")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "worker_id")
    private WorkerProfile worker;

    @ManyToOne
    @JoinColumn(name = "employer_id")
    private User employer;

    private int rating;

    @Column(length = 1024)
    private String review;

    private Timestamp createdAt;
}
