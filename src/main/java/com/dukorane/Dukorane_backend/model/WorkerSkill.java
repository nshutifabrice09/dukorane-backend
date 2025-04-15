package com.dukorane.Dukorane_backend.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name="worker_skills")
public class WorkerSkill {//Join Table

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private UUID id;

    @ManyToOne
    @JoinColumn(name = "worker_id")
    private WorkerProfile worker;

    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skill skill;

}
