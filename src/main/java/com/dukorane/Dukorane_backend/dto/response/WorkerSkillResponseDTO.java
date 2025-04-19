package com.dukorane.Dukorane_backend.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WorkerSkillResponseDTO {
    private UUID id;
    private UUID workerId;
    private UUID skillId;

}
