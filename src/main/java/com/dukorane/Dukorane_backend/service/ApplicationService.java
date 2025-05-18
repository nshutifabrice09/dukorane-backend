package com.dukorane.Dukorane_backend.service;

import com.dukorane.Dukorane_backend.model.Application;

import java.util.List;
import java.util.UUID;

public interface ApplicationService {

    List<Application> getAllApplications();
    Application getApplicationById(UUID id);
    Application saveApplication (Application application, UUID gigId, UUID workerId);
    Application updateApplication (UUID id, Application application);
    void deleteById (UUID id);
}
