package com.dukorane.Dukorane_backend.controller;


import com.dukorane.Dukorane_backend.model.TVETInstitution;
import com.dukorane.Dukorane_backend.service.TVETInstitutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:3000")
public class TVETInstitutionController {

    private final TVETInstitutionService tvetInstitutionService;

    @Autowired
    public TVETInstitutionController (TVETInstitutionService tvetInstitutionService){
        this.tvetInstitutionService =tvetInstitutionService;
    }

    @PostMapping("/tvetInstitution")
    public TVETInstitution saveTVETInstitution(@RequestBody TVETInstitution tvetInstitution){
        return tvetInstitutionService.saveTVETInstitution(tvetInstitution);
    }
}
