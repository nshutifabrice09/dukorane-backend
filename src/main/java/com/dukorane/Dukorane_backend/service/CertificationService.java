package com.dukorane.Dukorane_backend.service;

import com.dukorane.Dukorane_backend.model.Certification;

import java.util.List;
import java.util.UUID;

public interface CertificationService {

    List<Certification> getAllCertifications();
    Certification getCertificationById (UUID id);
    Certification saveCertification (Certification certification);
    Certification updateCertification (UUID id, Certification certification);
    void deleteById (UUID id);

}
