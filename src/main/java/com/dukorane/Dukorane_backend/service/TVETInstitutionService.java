package com.dukorane.Dukorane_backend.service;

import com.dukorane.Dukorane_backend.model.TVETInstitution;

import java.util.List;
import java.util.UUID;

public interface TVETInstitutionService {
    List<TVETInstitution> getAllTvetInstitutions();
    TVETInstitution getTVETInstitutionById (UUID id);
    TVETInstitution saveTvetInstitution (TVETInstitution tvetInstitution);
    TVETInstitution updateTvetInstitution (UUID id, TVETInstitution tvetInstitution);
    void removeById (UUID id);

}
