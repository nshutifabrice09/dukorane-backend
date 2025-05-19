package com.dukorane.Dukorane_backend.service;

import com.dukorane.Dukorane_backend.model.TVETInstitution;

import java.util.List;
import java.util.UUID;

public interface TVETInstitutionService {
    List<TVETInstitution> getAllTVETInstitutions();
    TVETInstitution getTVETInstitutionById (Long id);
    TVETInstitution saveTVETInstitution (TVETInstitution tvetInstitution, Long userId);
    TVETInstitution updateTVETInstitution (Long id, TVETInstitution tvetInstitution);
    void deleteById (Long id);

}
