package com.app.splitwise.Models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExpensePaidBy {
    private String name;
    private int contri;

    public ExpensePaidBy(String name, int contri) {
        this.name = name;
        this.contri = contri;
    }
}
