package com.dukorane.Dukorane_backend.repository;

import com.dukorane.Dukorane_backend.model.Gig;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface GigRepository extends JpaRepository <Gig, UUID> {
}
