package com.dukorane.Dukorane_backend.repository;

import com.dukorane.Dukorane_backend.model.Gig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface GigRepository extends JpaRepository <Gig, UUID> {
    Gig findGigById(Long gigId);
}
