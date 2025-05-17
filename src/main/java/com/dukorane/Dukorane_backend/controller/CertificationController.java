package com.dukorane.Dukorane_backend.controller;


import com.dukorane.Dukorane_backend.model.Certification;
import com.dukorane.Dukorane_backend.service.CertificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@CrossOrigin("http://localhost:3000")
public class CertificationController {

    private final CertificationService certificationService;

    @Autowired
    public CertificationController(CertificationService certificationService){
        this.certificationService = certificationService;
    }

    @PostMapping("/certification")
    public Certification saveCertification(@RequestBody Certification certification){
        return certificationService.saveCertification(certification);
    }

    @GetMapping("/certifications")
    public List<Certification> certificationList(){
        return certificationService.getAllCertifications();
    }

    @GetMapping("/certification/{id}")
    public Certification findById(@PathVariable ("id") UUID id){
        return certificationService.getCertificationById(id);
    }

    @PutMapping("/update/certification/{id}")
    public Certification updateCertification(@PathVariable("id") UUID id, @RequestBody Certification certification){
        return certificationService.updateCertification (id, certification);
    }

    @DeleteMapping("/delete/certification/{id}")
    public void deleteById(@PathVariable("id") UUID id){
        certificationService.deleteById(id);
    }

}
