package com.kitcenter.runners.homework.lesson12;


import com.kitcenter.app.homework.lesson12.ReadWriteModify;

import java.io.IOException;

public class HomeTask12Runner {
    public static void main(String[] args) throws IOException {
        ReadWriteModify rwm = new ReadWriteModify();
        rwm.readLineInFile("src\\main\\resources\\input_file.txt");
        rwm.writeLineInFile("src\\main\\resources\\output_file.txt");
    }
}
