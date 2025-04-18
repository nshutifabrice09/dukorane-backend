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

    public Review() {
    }

    public Review(UUID id, WorkerProfile worker, User employer, int rating, String review, Timestamp createdAt) {
        this.id = id;
        this.worker = worker;
        this.employer = employer;
        this.rating = rating;
        this.review = review;
        this.createdAt = createdAt;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public WorkerProfile getWorker() {
        return worker;
    }

    public void setWorker(WorkerProfile worker) {
        this.worker = worker;
    }

    public User getEmployer() {
        return employer;
    }

    public void setEmployer(User employer) {
        this.employer = employer;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }
}
