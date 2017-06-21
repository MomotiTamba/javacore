package com.kitcenter.app.classwork.lesson17.Enum;


public enum Holiday {
    NEW_YEAR(1, "January", "New Year"), EASTER(16, "April", "Easter"), MOTHERS_DAY(8, "March", "Mothers day");

    private int day;
    private String month;
    private String name;

    Holiday(int day, String month, String name) {
        this.day = day;
        this.month = month;
        this.name = name;
    }

    public int getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }

    public String getName() {
        return name;
    }

}
