package com.dukorane.Dukorane_backend.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "portofolios")
public class Portfolio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private UUID id;

    @ManyToOne
    @JoinColumn(name = "worker_id")
    private WorkerProfile worker;

    private String mediaUrl;
    private String caption;

    public Portfolio() {
    }

    public Portfolio(UUID id, WorkerProfile worker, String mediaUrl, String caption) {
        this.id = id;
        this.worker = worker;
        this.mediaUrl = mediaUrl;
        this.caption = caption;
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

    public String getMediaUrl() {
        return mediaUrl;
    }

    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }
}
