package com.dukorane.Dukorane_backend.controller;

import com.dukorane.Dukorane_backend.model.WorkerSkill;
import com.dukorane.Dukorane_backend.service.WorkerSkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@CrossOrigin("http://localhost:3000")
public class WorkerSkillController {

    private WorkerSkillService workerSkillService;

    @Autowired
    public WorkerSkillController (WorkerSkillService workerSkillService){
        this.workerSkillService = workerSkillService;
    }

    

    @GetMapping("/workerSkills")
    public List <WorkerSkill> workerSkillList(){
        return workerSkillService.getAllWorkerSkills();
    }

    @GetMapping("/workerSkill/{id}")
    public WorkerSkill findById (@PathVariable ("id")UUID id){
        return workerSkillService.getWorkerSkillById(id);
    }

    @PutMapping("/update/workerSkill/{id}")
    public WorkerSkill updateWorkerSkill(@PathVariable ("id") UUID id, @RequestBody WorkerSkill workerSkill){
        return workerSkillService.updateWorkerSkill(id, workerSkill);
    }

    @DeleteMapping("/delete/workerSkill/{id}")
    public void deleteById(@PathVariable ("id") UUID id){
        workerSkillService.deleteById(id);
    }
}
