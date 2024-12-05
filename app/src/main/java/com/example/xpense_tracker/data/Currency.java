package com.example.xpense_tracker.data;

public enum Currency {
    CAD(0.0038), USD(0.0028), EUR(0.0026);

    public double getChangingNum() {
        return changingNum;
    }

    private final double changingNum;

    Currency(double changingNum) {
        this.changingNum = changingNum;
    }
}
