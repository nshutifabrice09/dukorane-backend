package com.dukorane.Dukorane_backend.controller;


import com.dukorane.Dukorane_backend.model.WorkerProfile;
import com.dukorane.Dukorane_backend.service.WorkerProfileService;
import org.hibernate.jdbc.Work;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

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

    @GetMapping("/workerProfiles")
    public List<WorkerProfile> workerProfilesList(){
        return workerProfileService.getAllWorkerProfiles();
    }

    @GetMapping("/workerProfile/{id}")
    public WorkerProfile findById(@PathVariable ("id")UUID id){
        return workerProfileService.getWorkerProfileById(id);
    }

    @PutMapping("/update/workerProfile/{id}")
    public WorkerProfile updateWorkerProfile(@PathVariable ("id") UUID id, @RequestBody WorkerProfile workerProfile){
        return workerProfileService.updateWorkerProfile(id, workerProfile);
    }

    @DeleteMapping("/delete/workerProfile/{id}")
    public void deleteById(@PathVariable ("id") UUID id){
        workerProfileService.deleteById(id);
    }


}
