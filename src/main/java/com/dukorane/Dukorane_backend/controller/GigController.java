package com.dukorane.Dukorane_backend.controller;

import com.dukorane.Dukorane_backend.model.Gig;
import com.dukorane.Dukorane_backend.service.GigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@CrossOrigin("http://localhost:3000")
public class GigController {

    private final GigService gigService;

    @Autowired
    public GigController(GigService gigService){
        this.gigService = gigService;
    }



    @GetMapping("/gigs")
    public List<Gig> gigList(){
        return gigService.getAllGigs();
    }

    @GetMapping("/gigs/{id}")
    public Gig findById(@PathVariable ("id") UUID id){
        return gigService.getGigById(id);
    }

    @PutMapping("/update/gig/{id}")
    public Gig updateGig(@PathVariable ("id") UUID id, @RequestBody Gig gig){
        return gigService.updateGig(id, gig);
    }

    @DeleteMapping("/delete/gig/{id}")
    public void deleteById (@PathVariable ("id") UUID id){
        gigService.deleteById(id);
    }
}
