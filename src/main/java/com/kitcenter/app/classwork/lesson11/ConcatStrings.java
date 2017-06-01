package com.kitcenter.app.classwork.lesson11;


public class ConcatStrings {

    public long checkConcatTime(String s, String f) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000L; i++) {
            s.concat(f);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    public long checkStringBuilderTime(String s, String f) {
        StringBuilder sb = new StringBuilder(s);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000L; i++) {
            sb.append(f);
        }
        long end = System.currentTimeMillis();
        return end- start;
    }


}
