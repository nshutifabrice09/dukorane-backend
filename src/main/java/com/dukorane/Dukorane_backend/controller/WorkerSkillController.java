package com.dukorane.Dukorane_backend.controller;

import com.dukorane.Dukorane_backend.service.WorkerSkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:3000")
public class WorkerSkillController {

    private WorkerSkillService workerSkillService;

    @Autowired
    public WorkerSkillController (WorkerSkillService workerSkillService){
        this.workerSkillService = workerSkillService;
    }
}
