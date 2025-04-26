package com.dukorane.Dukorane_backend.service;

import com.dukorane.Dukorane_backend.model.Certification;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Service
public class CertificationServiceImplementation implements CertificationService{
    @Override
    public List<Certification> getAllCertifications() {
        return null;
    }

    @Override
    public Certification getCertificationById(UUID id) {
        return null;
    }

    @Override
    public Certification saveCertification(Certification certification) {
        return null;
    }

    @Override
    public Certification updateCertification(UUID id, Certification certification) {
        return null;
    }

    @Override
    public void deleteById(UUID id) {

    }
}
