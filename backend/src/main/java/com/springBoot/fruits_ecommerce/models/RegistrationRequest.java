package com.springBoot.fruits_ecommerce.models;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RegistrationRequest {
    @NotBlank(message = "username is required")
    @NotNull(message = "username cannot be null")
    private String username;

    @NotBlank(message = "email is required")
    @NotNull(message = "email cannot be null")
    @Email(message = "Email should be valid")
    private String email;

    @NotBlank(message = "password is required")
    @NotNull(message = "password cannot be null")
    @Size(min = 8, max = 250, message = "password must be at least 8 characters")
    private String password;

}
