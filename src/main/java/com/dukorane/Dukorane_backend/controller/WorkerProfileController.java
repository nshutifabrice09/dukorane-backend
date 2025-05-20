package com.dukorane.Dukorane_backend.controller;

import com.dukorane.Dukorane_backend.model.WorkerProfile;
import com.dukorane.Dukorane_backend.service.WorkerProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class WorkerProfileController {

    private final WorkerProfileService workerProfileService;

    @Autowired
    public WorkerProfileController(WorkerProfileService workerProfileService) {
        this.workerProfileService = workerProfileService;
    }

    @PostMapping("/workerProfile/{userId}")
    public WorkerProfile save(@RequestBody WorkerProfile workerProfile, @PathVariable ("userId") Long userId){
        return workerProfileService.saveWorkerProfile(workerProfile, userId);
    }

    @GetMapping("/workerProfiles")
    public List<WorkerProfile> workerProfileList(){
        return workerProfileService.getAllWorkerProfiles();
    }

    @GetMapping("/workerProfile/{id}")
    public WorkerProfile getWorkerProfile(@PathVariable ("id") Long id){
        return workerProfileService.getWorkerProfileById(id);
    }

    @PutMapping("/update/workerProfile/{id}")
    public WorkerProfile updateWorkerProfile(@RequestBody WorkerProfile workerProfile, @PathVariable ("id") Long id){
        return workerProfileService.updateWorkerProfile(id, workerProfile);
    }

    @DeleteMapping("/delete/workerProfile/{id}")
    public void remove(@PathVariable ("id") Long id){
        workerProfileService.deleteById(id);
    }

}
