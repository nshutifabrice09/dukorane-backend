package com.dukorane.Dukorane_backend.dot.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SkillResponseDTO {
    private UUID id;
    private String name;
    private String category;
}
