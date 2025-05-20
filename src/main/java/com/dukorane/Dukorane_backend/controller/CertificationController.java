package com.dukorane.Dukorane_backend.controller;


import com.dukorane.Dukorane_backend.model.Certification;
import com.dukorane.Dukorane_backend.service.CertificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class CertificationController {

    private final CertificationService certificationService;

    @Autowired
    public CertificationController(CertificationService certificationService) {
        this.certificationService = certificationService;
    }

    @PostMapping("/certification/{tvetId}")
    public Certification save(@RequestBody Certification certification, @PathVariable ("tvetId") Long tvetId){
        return certificationService.saveCertification(certification, tvetId);
    }

    @GetMapping("/certifications")
    public List<Certification> certificationList(){
        return certificationService.getAllCertifications();
    }

    @GetMapping("/certification/{id}")
    public Certification getCertification(@PathVariable ("id") Long id){
        return certificationService.getCertificationById(id);
    }
    @PutMapping("/update/certification/{id}")
    public Certification updateCertification(@RequestBody Certification certification, @PathVariable("id") Long id){
        return certificationService.updateCertification(id, certification);
    }

    @DeleteMapping("/delete/certification/{id}")
    public void deleteCertification(@PathVariable ("id") Long id){
        certificationService.deleteById(id);
    }
}
