package com.dukorane.Dukorane_backend.service;

import com.dukorane.Dukorane_backend.model.WorkerSkill;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Service
public class WorkerSkillServiceImplementation implements WorkerSkillService{
    @Override
    public List<WorkerSkill> getAllWorkerSkills() {
        return null;
    }

    @Override
    public WorkerSkill getWorkerSkillById(UUID id) {
        return null;
    }

    @Override
    public WorkerSkill saveWorkerSkill(WorkerSkill WorkerSkill) {
        return null;
    }

    @Override
    public WorkerSkill updateWorkerSkill(UUID id, WorkerSkill WorkerSkill) {
        return null;
    }

    @Override
    public void deleteById(UUID id) {

    }

}
