package com.dukorane.Dukorane_backend.service;

import com.dukorane.Dukorane_backend.model.WorkerProfile;

import java.util.List;
import java.util.UUID;

public interface WorkerProfileService {
    List<WorkerProfile> getAllWorkerProfiles ();
    WorkerProfile getWorkerProfileById (UUID id);
    WorkerProfile saveWorkerProfile (WorkerProfile WorkerProfile);
    WorkerProfile updateWorkerProfile (UUID id, WorkerProfile WorkerProfile);
    void deleteById (UUID id);
}
