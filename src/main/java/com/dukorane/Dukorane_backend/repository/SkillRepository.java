package com.dukorane.Dukorane_backend.repository;

import com.dukorane.Dukorane_backend.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SkillRepository extends JpaRepository <Skill, Long> {
    Skill findSkillById(Long skillId);
}
