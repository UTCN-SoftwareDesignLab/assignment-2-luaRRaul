package com.cartismh.user.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Set;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class UserCreationDTO {
    private Long id;
    private String username;
    private String email;
    private String password;
    private Set<String> roles;
}
