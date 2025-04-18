package com.dukorane.Dukorane_backend.repository;

import com.dukorane.Dukorane_backend.model.WorkerSkill;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface WorkerSkillRepository extends JpaRepository <WorkerSkill, UUID> {
}
