package com.dukorane.Dukorane_backend.service;

import com.dukorane.Dukorane_backend.model.Certification;
import com.dukorane.Dukorane_backend.model.TVETInstitution;
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
        TVETInstitution tvetInstitution = tvetInstitutionRepository.findTvetInstitutionById(tvetId);
        certification.setTvet(tvetInstitution);
        return certificationRepository.save(certification);
    }

    @Override
    public Certification updateCertification(Long id, Certification certification) {
        Certification existCertification = certificationRepository.findCertificationById(id);
        if(existCertification != null){
            existCertification.setTitle(certification.getTitle());
            existCertification.setIssueDate(certification.getIssueDate());
            existCertification.setFileUrl(certification.getFileUrl());
            return certificationRepository.save(existCertification);
        }
        return null;
    }

    @Override
    public void deleteById(Long id) {
        tvetInstitutionRepository.deleteById(id);
    }
}
