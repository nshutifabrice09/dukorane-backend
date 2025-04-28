package com.dukorane.Dukorane_backend.service;

import com.dukorane.Dukorane_backend.model.TVETInstitution;

import java.util.List;
import java.util.UUID;

public interface TVETInstitutionService {
    List<TVETInstitution> getAllTVETInstitutions();
    TVETInstitution getTVETInstitutionById (UUID id);
    TVETInstitution saveTVETInstitution (TVETInstitution tvetInstitution);
    TVETInstitution updateTVETInstitution (UUID id, TVETInstitution tvetInstitution);
    void deleteById (UUID id);

}
