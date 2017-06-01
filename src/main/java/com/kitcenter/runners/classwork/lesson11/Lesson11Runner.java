package com.kitcenter.runners.classwork.lesson11;


import com.kitcenter.app.classwork.lesson11.ConcatStrings;
import com.kitcenter.app.classwork.lesson11.Encoder;
import com.kitcenter.app.classwork.lesson11.MyFileReader;

import java.io.IOException;

public class Lesson11Runner {
    public static void main(String[] args) throws IOException {
        ConcatStrings concatStrings = new ConcatStrings();
        System.out.println(concatStrings.checkConcatTime("start", "finish"));
        System.out.println(concatStrings.checkStringBuilderTime("start", "finish"));

        Encoder encoder = new Encoder();
        System.out.println(encoder.stringEncode("Today a good weather, so I have a good mood"));

        MyFileReader myFileReader = new MyFileReader();
        myFileReader.bufReaderFile();
    }
}
