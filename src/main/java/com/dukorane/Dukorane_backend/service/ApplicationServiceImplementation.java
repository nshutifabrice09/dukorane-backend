package com.dukorane.Dukorane_backend.service;

import com.dukorane.Dukorane_backend.model.Application;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Service
public class ApplicationServiceImplementation implements ApplicationService{
    @Override
    public List<Application> getAllApplications() {
        return null;
    }

    @Override
    public Application getApplicationById(UUID id) {
        return null;
    }

    @Override
    public Application saveApplication(Application application, Long gigId, Long workerId) {
        return null;
    }


    @Override
    public Application updateApplication(UUID id, Application application) {
        return null;
    }

    @Override
    public void deleteById(UUID id) {

    }

}
