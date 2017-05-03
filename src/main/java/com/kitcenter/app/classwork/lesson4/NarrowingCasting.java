package com.kitcenter.app.classwork.lesson4;


public class NarrowingCasting {
    int int1 = 127;
    float float1 = 0.0f;

    public void narrowingIntToFloat() {
        float1 = int1;
        System.out.println(float1);
    }

    public void narrowingFloatToInt() {
        int1 = (int) float1;
        System.out.println(int1);
    }

    public void narrowingDoubleToFloat() {
        double double1 = 3.14159d;
        float float1;

        float1 = (float) double1;
        System.out.println(float1);

    }
}
