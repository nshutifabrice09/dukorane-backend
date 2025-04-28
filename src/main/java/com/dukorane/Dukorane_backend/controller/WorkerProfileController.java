package com.dukorane.Dukorane_backend.controller;


import com.dukorane.Dukorane_backend.model.WorkerProfile;
import com.dukorane.Dukorane_backend.service.WorkerProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:3000")
public class WorkerProfileController {

    private final WorkerProfileService workerProfileService;

    @Autowired
    public WorkerProfileController(WorkerProfileService workerProfileService){
        this.workerProfileService = workerProfileService;
    }

    @PostMapping("/workerProfile")
    public WorkerProfile saveWorkerProfile(@RequestBody WorkerProfile workerProfile){
        return workerProfileService.saveWorkerProfile(workerProfile);
    }
}
