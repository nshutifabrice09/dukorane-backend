package com.dukorane.Dukorane_backend.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WorkerProfileResponseDTO {

    private UUID id;
    private UUID userId;
    private String address;
    private boolean verifiedByTvet;
}
