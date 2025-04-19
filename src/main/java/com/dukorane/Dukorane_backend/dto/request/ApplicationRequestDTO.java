package com.dukorane.Dukorane_backend.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ApplicationRequestDTO {

    private UUID workerId;
    private UUID gigId;
    private String note;


}
