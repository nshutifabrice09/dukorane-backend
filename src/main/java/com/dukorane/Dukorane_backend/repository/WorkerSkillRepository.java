package com.dukorane.Dukorane_backend.repository;

import com.dukorane.Dukorane_backend.model.WorkerSkill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface WorkerSkillRepository extends JpaRepository <WorkerSkill, Long> {
}
