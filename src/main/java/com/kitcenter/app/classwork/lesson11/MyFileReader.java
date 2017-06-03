package com.kitcenter.app.classwork.lesson11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyFileReader {

    public void bufReaderFile() throws FileNotFoundException {
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader("C:\\Users\\muon\\KIT\\javacore\\src\\main\\resources\\input.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Regardless about exception you will see this text");
        }
    }
}
