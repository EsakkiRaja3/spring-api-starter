package com.codewithmosh.store.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ReqisterUserRequest {
    @NotBlank(message = "Name is required")
    private String name;
    @Email(message = "Please provide valid email")
    private String email;
    private String password;
}
