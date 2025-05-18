package com.dukorane.Dukorane_backend.service;

import com.dukorane.Dukorane_backend.model.Certification;
import com.dukorane.Dukorane_backend.repository.CertificationRepository;
import com.dukorane.Dukorane_backend.repository.TVETInstitutionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CertificationServiceImplementation implements CertificationService{

    private final CertificationRepository certificationRepository;
    private final TVETInstitutionRepository tvetInstitutionRepository;

    @Autowired
    public CertificationServiceImplementation(CertificationRepository certificationRepository, TVETInstitutionRepository tvetInstitutionRepository) {
        this.certificationRepository = certificationRepository;
        this.tvetInstitutionRepository = tvetInstitutionRepository;
    }

    @Override
    public List<Certification> getAllCertifications() {
        return certificationRepository.findAll();
    }

    @Override
    public Certification getCertificationById(Long id) {
        return certificationRepository.findCertificationById(id);
    }

    @Override
    public Certification saveCertification(Certification certification, Long tvetId) {
        return null;
    }

    @Override
    public Certification updateCertification(Long id, Certification certification) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
