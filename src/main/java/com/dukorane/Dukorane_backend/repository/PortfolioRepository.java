package com.dukorane.Dukorane_backend.repository;

import com.dukorane.Dukorane_backend.model.Portofolio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PortofolioRepository extends JpaRepository <Portofolio, UUID> {
}
