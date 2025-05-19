package com.dukorane.Dukorane_backend.service;

import com.dukorane.Dukorane_backend.model.Skill;
import com.dukorane.Dukorane_backend.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillServiceImplementation implements SkillService{
    private final SkillRepository skillRepository;

    @Autowired
    public SkillServiceImplementation(SkillRepository skillRepository) {
        this.skillRepository = skillRepository;
    }

    @Override
    public List<Skill> getAllSkills() {
        return skillRepository.findAll();
    }

    @Override
    public Skill getSkillById(Long id) {
        return skillRepository.findSkillById(id);
    }

    @Override
    public Skill saveSkill(Skill skill) {
        return skillRepository.save(skill);
    }

    @Override
    public Skill updateSkill(Long id, Skill skill) {
        Skill existSkill = skillRepository.findSkillById(id);
        if(existSkill != null){
            existSkill.setName(skill.getName());
            existSkill.setCategory(skill.getCategory());
            return skillRepository.save(existSkill);
        }
        return null;
    }

    @Override
    public void deleteById(Long id) {
        skillRepository.deleteById(id);
    }
}
