package com.dukorane.Dukorane_backend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.UUID;

@Data
@Builder
@Entity
@Table(name = "applications")
@NoArgsConstructor
@AllArgsConstructor
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "gig_id")
    private Gig gig;

    @ManyToOne
    @JoinColumn(name = "worker_id")
    private WorkerProfile worker;

    private String message;

    @Enumerated(EnumType.STRING)
    private ApplicationStatus status;

    private LocalDate appliedAt;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public LocalDate getAppliedAt() {
        return appliedAt;
    }

    public void setAppliedAt(LocalDate appliedAt) {
        this.appliedAt = appliedAt;
    }
}
