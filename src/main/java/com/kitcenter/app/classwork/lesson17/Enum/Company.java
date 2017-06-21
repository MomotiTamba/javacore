package com.kitcenter.app.classwork.lesson17.Enum;


public enum Company {
    EBAY(30, "Ebay inc."), GOOGLE(10, "Google inc.");

    private int value;
    private String fullName;

    Company(int value, String fullName) {
        this.value = value;
        this.fullName = fullName;
    }

    public int getValue() {
        return value;
    }

    public String getFullName() {
        return fullName;
    }
}
