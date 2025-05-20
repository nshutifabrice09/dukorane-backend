package com.dukorane.Dukorane_backend.service;

import com.dukorane.Dukorane_backend.model.WorkerSkill;

import java.util.List;


public interface WorkerSkillService {
    List<WorkerSkill> getAllWorkerSkills ();
    WorkerSkill getWorkerSkillById (Long id);
    WorkerSkill saveWorkerSkill (WorkerSkill WorkerSkill);
    WorkerSkill updateWorkerSkill (Long id, WorkerSkill WorkerSkill);
    void deleteById (Long id);
}
