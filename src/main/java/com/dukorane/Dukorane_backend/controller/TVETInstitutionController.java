package com.dukorane.Dukorane_backend.controller;


import com.dukorane.Dukorane_backend.model.TVETInstitution;
import com.dukorane.Dukorane_backend.service.TVETInstitutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class TVETInstitutionController {

    private final TVETInstitutionService tvetInstitutionService;


    @Autowired
    public TVETInstitutionController(TVETInstitutionService tvetInstitutionService) {
        this.tvetInstitutionService = tvetInstitutionService;
    }

    @PostMapping("/tvetInstitution/{userId}")
    public TVETInstitution save(@RequestBody TVETInstitution tvetInstitution, @PathVariable ("userId") Long userId){
        return tvetInstitutionService.saveTVETInstitution(tvetInstitution, userId);
    }

    @GetMapping("/tvetInstitutions")
    public List<TVETInstitution> tvetInstitutionList(){
        return tvetInstitutionService.getAllTVETInstitutions();
    }

    @GetMapping("/tvetInstitution/{id}")
    public TVETInstitution getTvetInstitution(@PathVariable ("id") Long id){
        return tvetInstitutionService.getTVETInstitutionById(id);
    }

    @PutMapping("/update/tvetInstitution/{id}")
    public TVETInstitution updateInstitution(@PathVariable ("id") Long id,@RequestBody TVETInstitution tvetInstitution){
        return tvetInstitutionService.updateTVETInstitution(id, tvetInstitution);
    }

    @DeleteMapping("/delete/tvetInstitution/{id}")
    public void delete(@PathVariable ("id") Long id){
        tvetInstitutionService.deleteById(id);
    }


}
