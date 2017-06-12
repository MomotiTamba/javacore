package com.kitcenter.app.homework.lesson13;


public class WhiteCollar extends Human {

    private String companyName;

    public WhiteCollar() {
    }

    public WhiteCollar(String name, int age, String companyName) {
        super(name, age);
        this.companyName = companyName;
        setCompanyName(companyName);
    }

    public void setCompanyName(String companyName) {
        if (companyName.matches("[a-zA-Z0-9-, ]+")) {
            this.companyName = companyName;
            System.out.println("Company name - valid");
        } else {
            System.out.println("Company name is invalid");
        }
    }

    public String getCompanyName() {
        return companyName;
    }
}
