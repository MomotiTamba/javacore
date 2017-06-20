package com.kitcenter.runners.homework.lesson12;


import com.kitcenter.app.homework.lesson12.ReadWriteModify;

import java.io.IOException;

public class HomeTask12Runner {
    public static void main(String[] args) throws IOException {
        ReadWriteModify rwm = new ReadWriteModify();
        rwm.readLineInFile(rwm.getSourceFile());
        rwm.writeLineInFile(rwm.getTargetFile());
    }
}
