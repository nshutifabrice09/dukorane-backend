package com.dukorane.Dukorane_backend.service;

import com.dukorane.Dukorane_backend.model.WorkerSkill;

import java.util.List;
import java.util.UUID;

public interface WorkerSkillService {
    List<WorkerSkill> getAllWorkerSkills ();
    WorkerSkill getWorkerSkillById (UUID id);
    WorkerSkill saveWorkerSkill (WorkerSkill WorkerSkill);
    WorkerSkill updateWorkerSkill (UUID id, WorkerSkill WorkerSkill);
    void deleteById (UUID id);
}
