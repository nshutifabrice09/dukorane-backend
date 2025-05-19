package com.dukorane.Dukorane_backend.service;

import com.dukorane.Dukorane_backend.model.TVETInstitution;
import com.dukorane.Dukorane_backend.model.User;
import com.dukorane.Dukorane_backend.repository.TVETInstitutionRepository;
import com.dukorane.Dukorane_backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TVETInstitutionServiceImplementation implements TVETInstitutionService{

    private final TVETInstitutionRepository tvetInstitutionRepository;
    private final UserRepository userRepository;

    @Autowired
    public TVETInstitutionServiceImplementation(TVETInstitutionRepository tvetInstitutionRepository, UserRepository userRepository) {
        this.tvetInstitutionRepository = tvetInstitutionRepository;
        this.userRepository = userRepository;
    }

    @Override
    public List<TVETInstitution> getAllTVETInstitutions() {
        return tvetInstitutionRepository.findAll();
    }

    @Override
    public TVETInstitution getTVETInstitutionById(Long id) {
        return tvetInstitutionRepository.findTvetInstitutionById(id);
    }

    @Override
    public TVETInstitution saveTVETInstitution(TVETInstitution tvetInstitution, Long userId) {
        User user = userRepository.findUserById(userId);
        tvetInstitution.setUser(user);
        return tvetInstitutionRepository.save(tvetInstitution);
    }

    @Override
    public TVETInstitution updateTVETInstitution(Long id, TVETInstitution tvetInstitution) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
