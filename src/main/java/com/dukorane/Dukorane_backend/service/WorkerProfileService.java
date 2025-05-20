package com.dukorane.Dukorane_backend.service;

import com.dukorane.Dukorane_backend.model.WorkerProfile;

import java.util.List;
import java.util.UUID;

public interface WorkerProfileService {
    List<WorkerProfile> getAllWorkerProfiles ();
    WorkerProfile getWorkerProfileById (Long id);
    WorkerProfile saveWorkerProfile (WorkerProfile WorkerProfile, Long userId);
    WorkerProfile updateWorkerProfile (Long id, WorkerProfile WorkerProfile);
    void deleteById (Long id);
}
