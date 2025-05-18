package com.dukorane.Dukorane_backend.service;

import com.dukorane.Dukorane_backend.model.Gig;

import java.util.List;
import java.util.UUID;

public interface GigService {
    List<Gig> getAllGigs ();
    Gig getGigById (Long id);
    Gig saveGig (Gig gig, Long employerId, Long skillId);
    Gig updateGig (Long id, Gig gig);
    void deleteById (Long id);
}
