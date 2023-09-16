package com.app.splitwise.DTOs;

import com.app.splitwise.Models.Transactions;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SettleGroupResponseDTO {
    private List<Transactions> transactions;
    //not returning password
    private ResponseStatus responseStatus;
    private String message;
}
