package com.dukorane.Dukorane_backend.repository;

import com.dukorane.Dukorane_backend.model.TVETInstitution;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TVETInstitutionRepository extends JpaRepository <TVETInstitution, UUID> {
}
