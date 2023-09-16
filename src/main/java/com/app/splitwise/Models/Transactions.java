package com.app.splitwise.Models;

public class Transactions {
    private String from;
    private String to;
    private int amount;

    @Override
    public String toString(){
        return from+" should pay "+amount+" to "+to;
    }

    public Transactions(String from, String to, int amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }
}
