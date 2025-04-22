package com.dukorane.Dukorane_backend.service;

import com.dukorane.Dukorane_backend.model.Gig;

import java.util.List;
import java.util.UUID;

public interface GigService {
    List<Gig> getAllGigs ();
    Gig getGigById (UUID id);
    Gig saveGig (Gig gig);
    Gig updateGig (UUID id, Gig gig);
    void deleteById (UUID id);
}
