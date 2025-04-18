package com.dukorane.Dukorane_backend.dot.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CertificationResponseDTO {

    private UUID id;
    private String title;
    private String issuedBy;
    private LocalDate issuedAt;

}
