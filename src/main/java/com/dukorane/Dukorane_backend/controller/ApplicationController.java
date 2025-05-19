package com.dukorane.Dukorane_backend.controller;

import com.dukorane.Dukorane_backend.exception.ApplicationNotFoundException;
import com.dukorane.Dukorane_backend.model.Application;
import com.dukorane.Dukorane_backend.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@CrossOrigin("http://localhost:3000")
public class ApplicationController {

    private final ApplicationService applicationService;

    @Autowired
    public ApplicationController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @PostMapping("/application/{gigId}/{workerId}")
    public Application save(@RequestBody Application application,
                            @PathVariable Long gigId, @PathVariable Long workerId){
        return applicationService.saveApplication(application, gigId, workerId);
    }

    @GetMapping("/applications")
    public List<Application> applicationList(){
        return applicationService.getAllApplications();
    }

    @GetMapping("/application/{id}")
    public Application getApplication(@PathVariable ("id") Long id){
        return applicationService.getApplicationById(id);
    }

    @PutMapping("/update/application/{id}")
    public Application updateApplication(@PathVariable ("id") Long id, @RequestBody Application application){
        return applicationService.updateApplication(id, application);
    }

    @DeleteMapping("/delete/application/{id}")
    public void deleteApplication(@PathVariable ("id") Long id){
        applicationService.deleteById(id);
    }
}
