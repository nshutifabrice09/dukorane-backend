package com.dukorane.Dukorane_backend.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CertificationRequestDTO {

    private UUID workerId;
    private UUID tvetId;
    private String title;
    private String issuedBy;
    private LocalDate issuedAt;
}
