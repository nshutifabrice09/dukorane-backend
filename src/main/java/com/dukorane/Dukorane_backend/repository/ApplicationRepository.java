package com.dukorane.Dukorane_backend.repository;

import com.dukorane.Dukorane_backend.model.Application;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ApplicationRepository extends JpaRepository <Application, UUID> {
}
