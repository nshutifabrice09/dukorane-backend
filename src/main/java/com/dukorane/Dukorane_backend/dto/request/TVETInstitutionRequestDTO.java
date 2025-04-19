package com.dukorane.Dukorane_backend.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TVETInstitutionRequestDTO {

    private String name;
    private String location;
    private UUID userId;
}
