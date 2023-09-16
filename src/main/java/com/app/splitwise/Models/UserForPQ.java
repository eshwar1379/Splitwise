package com.app.splitwise.Models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserForPQ {

    private String name;
    private int balance;

    public UserForPQ(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public int compareTo(UserForPQ o) {return o.balance - this.balance;}
}
