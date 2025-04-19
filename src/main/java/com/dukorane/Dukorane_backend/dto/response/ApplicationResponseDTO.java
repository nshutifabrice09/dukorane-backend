package com.dukorane.Dukorane_backend.dto.response;

import com.dukorane.Dukorane_backend.model.ApplicationStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApplicationResponseDTO {

    private UUID id;
    private UUID workerId;
    private UUID gigId;
    private ApplicationStatus status;
    private Timestamp appliedAt;
}
