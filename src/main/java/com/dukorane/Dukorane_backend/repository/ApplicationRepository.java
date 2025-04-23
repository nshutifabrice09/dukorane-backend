package com.dukorane.Dukorane_backend.repository;

import com.dukorane.Dukorane_backend.model.Application;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

public interface ApplicationRepository extends JpaRepository <Application, UUID> {

//    Application findApplicationId (UUID id);
//
//    @Transactional
//    @Modifying
//    @Query("DELETE FROM Application app WHERE app.id = :id")
//    void deleteApplicationById (@Param("id") UUID id);
}
