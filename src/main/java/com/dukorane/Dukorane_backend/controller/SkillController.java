package com.dukorane.Dukorane_backend.controller;

import com.dukorane.Dukorane_backend.model.Skill;
import com.dukorane.Dukorane_backend.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@CrossOrigin("http://localhost:3000")
public class SkillController {

    private final SkillService skillService;

    @Autowired
    public SkillController(SkillService skillService){
        this.skillService=skillService;
    }

    @PostMapping("/skill")
    public Skill save(@RequestBody Skill skill){
        return skillService.saveSkill(skill);
    }
    @GetMapping("/skills")
    public List<Skill> geSkillsList(){
        return skillService.getAllSkills();
    }

    @GetMapping("/skill/{id}")
    public Skill findById(@PathVariable ("id")UUID id){
        return skillService.getSkillById(id);
    }

    @PutMapping("/update/skill/{id}")
    public Skill updateSkill(@PathVariable ("id") UUID id, @RequestBody Skill skill){
        return skillService.updateSkill(id, skill);
    }

    @DeleteMapping("/delete/skill/{id}")
    public void deleteById(@PathVariable ("id") UUID id){
        skillService.deleteById(id);
    }

}
