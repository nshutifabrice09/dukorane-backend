package com.dukorane.Dukorane_backend.dto.response;

import com.dukorane.Dukorane_backend.model.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponseDTO {

    private UUID id;
    private String name;
    private String phoneNumber;
    private Role role;
}
