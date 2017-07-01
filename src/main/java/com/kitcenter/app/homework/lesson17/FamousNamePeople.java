package com.kitcenter.app.homework.lesson17;


public enum FamousNamePeople {
    CLINT_EASTWOOD(87, "Clint Eastwood", "Clinton Eastwood Jr.", "yes"),
    MICHAEL_JORDAN(54, "Michael Jordan", "Michael Jeffrey Jordan", "yes"),
    MORGAN_FREEMAN(80, "Morgan Freeman", "Morgan Freeman", "yes"),
    NIKOLA_TESLA(161, "Nikola Tesla", "Nikola Tesla", "no"),
    MARILYN_MONROE(91, "Marilyn Monroe", " Norma Jeane Mortenson", "no"),
    ALFRED_HITCHCOCK(118, "Alfred Hitchcock","Sir Alfred Joseph Hitchcock KBE", "no");

    private int age;
    private String fameName;
    private String trueName;
    private String live;

    FamousNamePeople(int age, String fameName, String trueName, String live) {
        this.age = age;
        this.fameName = fameName;
        this.trueName = trueName;
        this.live = live;
    }

    public int getAge() {
        return age;
    }

    public String getFameName() {
        return fameName;
    }

    public String getTrueName() {
        return trueName;
    }

    public String isLive() {
        return live;
    }
}
