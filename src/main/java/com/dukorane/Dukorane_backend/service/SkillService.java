package com.dukorane.Dukorane_backend.service;

import com.dukorane.Dukorane_backend.model.Skill;

import java.util.List;
import java.util.UUID;

public interface SkillService {
    List<Skill> getAllSkills ();
    Skill getSkillById (UUID id);
    Skill saveSkill (Skill skill);
    Skill updateSkill (UUID id, Skill skill);
    void deleteById (UUID id);

}
