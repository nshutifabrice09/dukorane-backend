package com.dukorane.Dukorane_backend.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "portofolios")
public class Portofolio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private UUID id;

    @ManyToOne
    @JoinColumn(name = "worker_id")
    private WorkerProfile worker;

    private String mediaUrl;
    private String caption;

}
