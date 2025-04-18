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

    public WorkerSkill() {
    }

    public WorkerSkill(UUID id, WorkerProfile worker, Skill skill) {
        this.id = id;
        this.worker = worker;
        this.skill = skill;
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

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }
}
