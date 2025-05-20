package com.dukorane.Dukorane_backend.service;

import com.dukorane.Dukorane_backend.model.WorkerProfile;
import com.dukorane.Dukorane_backend.repository.UserRepository;
import com.dukorane.Dukorane_backend.repository.WorkerProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkerProfileServiceImplementation implements WorkerProfileService {
    private final WorkerProfileRepository workerProfileRepository;
    private final UserRepository userRepository;

    @Autowired
    public WorkerProfileServiceImplementation(WorkerProfileRepository workerProfileRepository, UserRepository userRepository) {
        this.workerProfileRepository = workerProfileRepository;
        this.userRepository = userRepository;
    }

    @Override
    public List<WorkerProfile> getAllWorkerProfiles() {
        return workerProfileRepository.findAll();
    }

    @Override
    public WorkerProfile getWorkerProfileById(Long id) {
        return workerProfileRepository.findWorkerById(id);
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
        workerProfileRepository.deleteById(id);
    }
}
