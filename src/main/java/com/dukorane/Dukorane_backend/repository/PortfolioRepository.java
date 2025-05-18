package com.dukorane.Dukorane_backend.repository;

import com.dukorane.Dukorane_backend.model.Portfolio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PortfolioRepository extends JpaRepository <Portfolio, Long> {
    Portfolio findPortolioById(Long id);
}
