package com.kitcenter.runners.classwork.lesson14;


import com.kitcenter.app.classwork.lesson14.Student;

public class PersonRunner {
    public static void main(String[] args) {
        Student denis = new Student("Den");
        denis.showName();

        Student serg = new Student("Serg", 27);
        serg.showNameAndAge();
    }
}
