package com.app.splitwise.DTOs;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateUserResponseDTO {
    private Long userId;
    private ResponseStatus responseStatus;
    private String message ;
}
