package com.dukorane.Dukorane_backend.controller;

import com.dukorane.Dukorane_backend.model.Gig;
import com.dukorane.Dukorane_backend.service.GigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://localhost:3000")
public class GigController {

    private final GigService gigService;

    @Autowired
    public GigController(GigService gigService) {
        this.gigService = gigService;
    }

    @PostMapping("/gig/{userId}/{skillId}")
    public Gig saveGig(@RequestBody Gig gig, @PathVariable ("id") Long userId, @PathVariable ("id") Long skillId){
        return gigService.saveGig(gig, userId, skillId);
    }
}
