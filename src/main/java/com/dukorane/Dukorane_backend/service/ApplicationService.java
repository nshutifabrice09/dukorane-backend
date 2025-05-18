package com.dukorane.Dukorane_backend.service;

import com.dukorane.Dukorane_backend.model.Application;

import java.util.List;
import java.util.UUID;

public interface ApplicationService {

    List<Application> getAllApplications();
    Application getApplicationById(Long id);
    Application saveApplication (Application application, Long gigId, Long workerId);
    Application updateApplication (Long id, Application application);
    void deleteById (Long id);
}
