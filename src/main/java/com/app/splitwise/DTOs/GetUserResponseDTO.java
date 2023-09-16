package com.app.splitwise.DTOs;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetUserResponseDTO {
    private String name;
    private String uname;
    //not returning password
    private ResponseStatus responseStatus;
    private String message;
}
