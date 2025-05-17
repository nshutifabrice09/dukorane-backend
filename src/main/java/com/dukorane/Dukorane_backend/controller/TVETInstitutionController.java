package com.dukorane.Dukorane_backend.controller;


import com.dukorane.Dukorane_backend.model.TVETInstitution;
import com.dukorane.Dukorane_backend.service.TVETInstitutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@CrossOrigin("http://localhost:3000")
public class TVETInstitutionController {

    private final TVETInstitutionService tvetInstitutionService;

    @Autowired
    public TVETInstitutionController (TVETInstitutionService tvetInstitutionService){
        this.tvetInstitutionService =tvetInstitutionService;
    }

    

    @GetMapping("/tvetInstitutions")
    public List<TVETInstitution> tvetInstitutionList(){
        return tvetInstitutionService.getAllTVETInstitutions();
    }

    @GetMapping("/tvetInstitution/{id}")
    public TVETInstitution findById(@PathVariable ("id")UUID id){
        return tvetInstitutionService.getTVETInstitutionById(id);
    }

    @PutMapping("/update/tvetInstitution/{id}")
    public TVETInstitution updateTVETInstitution(@PathVariable ("id") UUID id, @RequestBody TVETInstitution tvetInstitution){
        return tvetInstitutionService.updateTVETInstitution(id, tvetInstitution);
    }

    @DeleteMapping("/delete/tvetInstitution/{id}")
    public void deleteById(@PathVariable ("id") UUID id){
        tvetInstitutionService.deleteById(id);
    }

}
