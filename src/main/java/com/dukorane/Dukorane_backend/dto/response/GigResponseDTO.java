package com.dukorane.Dukorane_backend.dto.response;

import com.dukorane.Dukorane_backend.model.GigStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class GigResponseDTO {
    private UUID id;
    private String title;
    private String location;
    private LocalDate deadline;
    private double budget;
    private GigStatus status;
}
