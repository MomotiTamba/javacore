package com.kitcenter.runners.classwork.lesson12;


import com.kitcenter.app.classwork.lesson10.Palindrome;
import com.kitcenter.app.classwork.lesson12.ReadWriteFile;
import java.io.IOException;


public class ReaderWriteRunner {
    public static void main(String[] args) throws IOException {
        Palindrome palindrome = new Palindrome();
        ReadWriteFile rwFile = new ReadWriteFile();

        if (palindrome.isPalindromeBuilder1(rwFile.readFileFromResources("input.txt")) == true){
            rwFile.writeFileToResources("output.txt");
        } else {
            System.out.println("Not palindrome");
        }
    }
}
