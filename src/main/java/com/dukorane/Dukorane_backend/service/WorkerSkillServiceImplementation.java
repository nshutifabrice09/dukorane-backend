package com.dukorane.Dukorane_backend.service;

import com.dukorane.Dukorane_backend.model.WorkerProfile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkerSkillServiceImplementation implements WorkerProfileService{
    @Override
    public List<WorkerProfile> getAllWorkerProfiles() {
        return null;
    }

    @Override
    public WorkerProfile getWorkerProfileById(Long id) {
        return null;
    }

    @Override
    public WorkerProfile saveWorkerProfile(WorkerProfile WorkerProfile, Long userId) {
        return null;
    }

    @Override
    public WorkerProfile updateWorkerProfile(Long id, WorkerProfile WorkerProfile) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
