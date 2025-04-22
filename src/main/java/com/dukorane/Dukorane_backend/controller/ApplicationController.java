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

    @PostMapping("/application")
    public Application save(@RequestBody Application application) {
        return applicationService.saveApplication(application);
    }

    @GetMapping("/applications")
    public List<Application> applicationList() {
        return applicationService.getAllApplications();
    }

    @GetMapping("/applications/{applicationId}")
    public Application findById(@PathVariable("applicationId") UUID id) {
        return applicationService.getApplicationById(id);
    }

    @DeleteMapping("/application/application/{applicationId}")
    public void removeById(@PathVariable("applicationId") UUID id) {
        applicationService.deleteById(id);
    }

    @PutMapping("/applications/applications/{applicationId}")
    public Application updateApplication(@PathVariable("applicationId") UUID id, @RequestBody Application application) {
        return applicationService.updateApplication(id, application);
    }

}
