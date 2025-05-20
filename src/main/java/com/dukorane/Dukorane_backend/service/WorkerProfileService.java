package com.dukorane.Dukorane_backend.service;

import com.dukorane.Dukorane_backend.model.WorkerProfile;

import java.util.List;

public interface WorkerProfileService {
    List<WorkerProfile> getAllWorkerProfiles ();
    WorkerProfile getWorkerProfileById (Long id);
    WorkerProfile saveWorkerProfile (WorkerProfile workerProfile, Long userId);
    WorkerProfile updateWorkerProfile (Long id, WorkerProfile workerProfile);
    void deleteById (Long id);
}
