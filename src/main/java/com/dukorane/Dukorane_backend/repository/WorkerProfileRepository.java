package com.dukorane.Dukorane_backend.repository;

import com.dukorane.Dukorane_backend.model.WorkerProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface WorkerProfileRepository extends JpaRepository <WorkerProfile, Long> {
    WorkerProfile findWorkerById(Long workerId);
}
