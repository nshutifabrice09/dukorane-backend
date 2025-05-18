package com.dukorane.Dukorane_backend.service;

import com.dukorane.Dukorane_backend.model.Application;
import com.dukorane.Dukorane_backend.model.Gig;
import com.dukorane.Dukorane_backend.model.WorkerProfile;
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
        return applicationRepository.findAll();
    }

    @Override
    public Application getApplicationById(Long id) {
        return applicationRepository.findApplicationById(id);
    }



    @Override
    public Application saveApplication(Application application, Long gigId, Long workerId) {
        Gig gig = gigRepository.findGigById(gigId);
        WorkerProfile workerProfile = workerProfileRepository.findWorkerById(workerId);
        application.setGig(gig);
        application.setWorker(workerProfile);
        return applicationRepository.save(application);
    }


    @Override
    public Application updateApplication(Long id, Application application) {
        Application existApplication = applicationRepository.findApplicationById(id);
        if(existApplication != null){
            existApplication.setGig(application.getGig());
            existApplication.setWorker(application.getWorker());
            existApplication.setMessage(application.getMessage());
            existApplication.setStatus(application.getStatus());
            return applicationRepository.save(application);
        }
        return null;
    }

    @Override
    public void deleteById(Long id) {
        applicationRepository.deleteById(id);
    }

}
