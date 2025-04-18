package com.dukorane.Dukorane_backend.dot.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SkillRequestDTO {
    private String name;
    private String category;

}
