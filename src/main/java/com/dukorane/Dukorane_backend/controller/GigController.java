package com.dukorane.Dukorane_backend.controller;

import com.dukorane.Dukorane_backend.model.Gig;
import com.dukorane.Dukorane_backend.service.GigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class GigController {

    private final GigService gigService;

    @Autowired
    public GigController(GigService gigService) {
        this.gigService = gigService;
    }

    @PostMapping("/gig/{userId}/{skillId}")
    public Gig saveGig(@RequestBody Gig gig, @PathVariable ("userId") Long userId, @PathVariable ("skillId") Long skillId){
        return gigService.saveGig(gig, userId, skillId);
    }
    @GetMapping("/gigs")
    public List<Gig> gigList(){
        return gigService.getAllGigs();
    }
    @GetMapping("/gig/{id}")
    public Gig getGig(@PathVariable ("id") Long id){
        return gigService.getGigById(id);
    }
    @PutMapping("/update/gig/{id}")
    public Gig updateGig(@RequestBody Gig gig, @PathVariable ("id") Long id){
        return gigService.updateGig(id, gig);
    }

    @DeleteMapping("/delete/gig/{id}")
    public void removeGig(@PathVariable ("id") Long id){
        gigService.deleteById(id);
    }
}
