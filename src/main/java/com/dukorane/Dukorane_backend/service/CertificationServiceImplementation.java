package com.dukorane.Dukorane_backend.service;

import com.dukorane.Dukorane_backend.model.Certification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CertificationServiceImplementation implements CertificationService{
    @Override
    public List<Certification> getAllCertifications() {
        return null;
    }

    @Override
    public Certification getCertificationById(Long id) {
        return null;
    }

    @Override
    public Certification saveCertification(Certification certification) {
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
