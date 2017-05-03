package com.kitcenter.runners.classwork.lesson4;

import com.kitcenter.app.classwork.lesson4.NarrowingCasting;
import com.kitcenter.app.classwork.lesson4.WideningCasting;

public class CastingRunner {
    public static void main(String[] args) {
        WideningCasting wc = new WideningCasting();
        wc.widening();
        NarrowingCasting nc = new NarrowingCasting();
        nc.narrowingIntToFloat();
        nc.narrowingFloatToInt();
        nc.narrowingDoubleToFloat();
    }

}
