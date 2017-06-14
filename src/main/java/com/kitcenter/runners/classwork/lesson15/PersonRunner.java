package com.kitcenter.runners.classwork.lesson15;


import com.kitcenter.app.classwork.lesson15.polymorphism.Person;
import com.kitcenter.app.classwork.lesson15.polymorphism.Student;
import com.kitcenter.app.classwork.lesson15.polymorphism.Teacher;
import com.kitcenter.app.classwork.lesson15.polymorphism.Worker;

public class PersonRunner {
    public static void main(String[] args) {
        /*Student student = new Student("Serg");
        System.out.println(student.getResponse("What is class?"));
        Teacher teacher = new Teacher("Teacher");
        System.out.println(teacher.getResponse("What time is now?"));*/

        Person personStudent = new Student("Fedr");
        System.out.println(personStudent);
//        System.out.println(personStudent.getResponse("What is the matter?"));
        showResponse(personStudent, "What class is it?");
        Person personTeacher = new Teacher("Ivan Ivanovych");
//        System.out.println(personTeacher.getResponse("Class, calm down!"));
        showResponse(personTeacher, "What is it now?");
        Person personWorker = new Worker("Where am I?");
        showResponse(personWorker, "What are you saying??");
    }

    public static void showResponse(Person person, String question){
        System.out.println(person.getResponse(question));
    }
}
