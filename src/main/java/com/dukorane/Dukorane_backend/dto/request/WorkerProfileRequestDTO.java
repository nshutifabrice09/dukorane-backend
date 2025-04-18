package com.dukorane.Dukorane_backend.dot.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WorkerProfileRequestDTO {
    private UUID userId;
    private String nationalId;
    private String address;
    private boolean verifiedByTvet;
}
