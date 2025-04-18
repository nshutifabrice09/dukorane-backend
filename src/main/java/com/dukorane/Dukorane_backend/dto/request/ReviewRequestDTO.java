package com.dukorane.Dukorane_backend.dot.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReviewRequestDTO {

    private UUID workerId;
    private UUID employerId;
    private UUID gigId;
    private int rating;
    private String comment;
}
