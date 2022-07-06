package com.spitfire.model;

public class Saving {
    int savingID;
    double remainingAmount;
    boolean isSafe;

    public Saving(int savingID, double remainingAmount,
                  boolean isSafe) {
        this.savingID = savingID;
        this.remainingAmount = remainingAmount;
        this.isSafe = isSafe;
    }
}
