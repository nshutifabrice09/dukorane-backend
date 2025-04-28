package com.dukorane.Dukorane_backend.service;

import com.dukorane.Dukorane_backend.model.TVETInstitution;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Service
public class TVETInstitutionServiceImplementation implements TVETInstitutionService{


    @Override
    public List<TVETInstitution> getAllTVETInstitutions() {
        return null;
    }

    @Override
    public TVETInstitution getTVETInstitutionById(UUID id) {
        return null;
    }

    @Override
    public TVETInstitution saveTVETInstitution(TVETInstitution tvetInstitution) {
        return null;
    }

    @Override
    public TVETInstitution updateTVETInstitution(UUID id, TVETInstitution tvetInstitution) {
        return null;
    }

    @Override
    public void deleteById(UUID id) {

    }
}
