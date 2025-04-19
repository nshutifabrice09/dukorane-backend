package com.dukorane.Dukorane_backend.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReviewResponseDTO {

    private UUID id;
    private int rating;
    private String comment;
    private UUID workerId;
    private UUID employerId;
}
