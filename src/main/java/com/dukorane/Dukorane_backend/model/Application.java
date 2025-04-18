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

    public Application() {
    }

    public Application(UUID id, Gig gig, WorkerProfile worker, String message, ApplicationStatus status, Timestamp appliedAt) {
        this.id = id;
        this.gig = gig;
        this.worker = worker;
        this.message = message;
        this.status = status;
        this.appliedAt = appliedAt;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Gig getGig() {
        return gig;
    }

    public void setGig(Gig gig) {
        this.gig = gig;
    }

    public WorkerProfile getWorker() {
        return worker;
    }

    public void setWorker(WorkerProfile worker) {
        this.worker = worker;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ApplicationStatus getStatus() {
        return status;
    }

    public void setStatus(ApplicationStatus status) {
        this.status = status;
    }

    public Timestamp getAppliedAt() {
        return appliedAt;
    }

    public void setAppliedAt(Timestamp appliedAt) {
        this.appliedAt = appliedAt;
    }
}
