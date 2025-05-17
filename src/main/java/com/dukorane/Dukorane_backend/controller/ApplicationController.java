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
    public Application saveApplication(@RequestBody Application application) {
        return applicationService.saveApplication(application);
    }

    @GetMapping("/applications")
    public List<Application> applicationList() {
        return applicationService.getAllApplications();
    }

    @GetMapping("/applications/{id}")
    public Application findById(@PathVariable("id") UUID id) {
        return applicationService.getApplicationById(id);
    }
    @PutMapping("/update/application/{id}")
    public Application updateApplication(@PathVariable("id") UUID id, @RequestBody Application application) {
        return applicationService.updateApplication(id, application);
    }
    @DeleteMapping("/delete/applications/{id}")
    public void removeById(@PathVariable("id") UUID id) {
        applicationService.deleteById(id);
    }



}
