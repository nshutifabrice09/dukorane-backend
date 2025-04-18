package com.dukorane.Dukorane_backend.repository;

import com.dukorane.Dukorane_backend.model.WorkerProfile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface WorkerProfileRepository extends JpaRepository <WorkerProfile, UUID> {
}
