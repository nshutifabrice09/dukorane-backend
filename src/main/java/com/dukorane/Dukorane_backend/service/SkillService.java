package com.dukorane.Dukorane_backend.service;

import com.dukorane.Dukorane_backend.model.Skill;

import java.util.List;
import java.util.UUID;

public interface SkillService {
    List<Skill> getAllSkills ();
    Skill getSkillById (Long id);
    Skill saveSkill (Skill skill);
    Skill updateSkill (Long id, Skill skill);
    void deleteById (Long id);

}
