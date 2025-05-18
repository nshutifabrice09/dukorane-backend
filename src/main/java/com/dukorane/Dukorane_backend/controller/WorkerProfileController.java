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


}
