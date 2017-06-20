package com.kitcenter.runners.classwork.lesson16;


import com.kitcenter.app.classwork.lesson16.Laptop;

public class LaptopRunner {
    public static void main(String[] args) {
        Laptop mac = new Laptop();
        mac.setName("Mac");
        mac.setColor("White");
        mac.setCpu(4);
        mac.setRam(16);

        Laptop hp = new Laptop();
        hp.setName("HP");
        hp.setColor("Black");
        hp.setCpu(4);
        hp.setRam(16);

        System.out.println(mac.equals(hp));

        String s1 = null;
        String s2 = "KIT";
        System.out.println(s2.equals(s1));
        //System.out.println(s1.equals(s2));

    }
}
