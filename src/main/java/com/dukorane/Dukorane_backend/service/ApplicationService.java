package com.dukorane.Dukorane_backend.service;

import com.dukorane.Dukorane_backend.model.Application;

import java.util.List;
import java.util.UUID;

public interface ApplicationService {

    List<Application> getAllApplications();
    Application getApplicationById(UUID id);
    Application saveApplication (Application application);
    Application updateApplication (UUID id, Application application);
    void removeById (UUID id);
}
