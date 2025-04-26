package com.dukorane.Dukorane_backend.service;

import com.dukorane.Dukorane_backend.model.Skill;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Service
public class SkillServiceImplementation implements SkillService{
    @Override
    public List<Skill> getAllSkills() {
        return null;
    }

    @Override
    public Skill getSkillById(UUID id) {
        return null;
    }

    @Override
    public Skill saveSkill(Skill skill) {
        return null;
    }

    @Override
    public Skill updateSkill(UUID id, Skill skill) {
        return null;
    }

    @Override
    public void deleteById(UUID id) {

    }

}
