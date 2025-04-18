package com.dukorane.Dukorane_backend.dot.request;

import com.dukorane.Dukorane_backend.model.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRequestDTO {

    private String name;
    private String phoneNumber;
    private String password;
    private Role role;

}
