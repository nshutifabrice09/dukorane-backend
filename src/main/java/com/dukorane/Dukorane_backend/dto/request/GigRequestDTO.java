package com.dukorane.Dukorane_backend.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDate;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class GigRequestDTO {

    private UUID employerId;
    private String title;
    private String description;
    private String location;
    private LocalDate deadline;
    private double budget;
}
