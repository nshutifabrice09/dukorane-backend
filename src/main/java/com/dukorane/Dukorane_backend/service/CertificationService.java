package com.dukorane.Dukorane_backend.service;

import com.dukorane.Dukorane_backend.model.Certification;

import java.util.List;
import java.util.UUID;

public interface CertificationService {

    List<Certification> getAllCertifications();
    Certification getCertificationById (Long id);
    Certification saveCertification (Certification certification, Long tvetId);
    Certification updateCertification (Long id, Certification certification);
    void deleteById (Long id);

}
