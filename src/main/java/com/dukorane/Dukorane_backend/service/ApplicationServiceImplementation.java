package com.dukorane.Dukorane_backend.service;

import com.dukorane.Dukorane_backend.model.Application;
import com.dukorane.Dukorane_backend.repository.ApplicationRepository;
import com.dukorane.Dukorane_backend.repository.GigRepository;
import com.dukorane.Dukorane_backend.repository.WorkerProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Service
public class ApplicationServiceImplementation implements ApplicationService{

    private final ApplicationRepository applicationRepository;
    private final GigRepository gigRepository;
    private final WorkerProfileRepository workerProfileRepository;

    @Autowired
    public ApplicationServiceImplementation(ApplicationRepository applicationRepository, GigRepository gigRepository, WorkerProfileRepository workerProfileRepository) {
        this.applicationRepository = applicationRepository;
        this.gigRepository = gigRepository;
        this.workerProfileRepository = workerProfileRepository;
    }



    @Override
    public List<Application> getAllApplications() {
        return null;
    }

    @Override
    public Application getApplicationById(UUID id) {
        return null;
    }

    @Override
    public Application saveApplication(Application application, UUID gigId, UUID workerId) {
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
