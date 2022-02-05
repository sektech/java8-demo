package com.company;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExample {
    static  List<Student> students = StudentDatabase.getAllStudents();
   static Consumer<Student> c1 = (student -> System.out.println(student.getName()));
    static Consumer<Student> c3 = (student -> System.out.println(student.getActivities()));
    static void printName(){
        students.forEach(c1);
    }
    static void printActivities(){
        students.forEach(c1.andThen(c3));;
    }
    static void printScoreFilter(){
        Consumer<Student> c5 = (student) ->{
            if(student.getGender() == "female"){
                System.out.println(student.getName() + ":" + student.getGender());
            }
        } ;
        students.forEach(c5);
    }

    static void printBiConsumer(){
        BiConsumer<String,List<String>> b1 = (name,activities)->{
            System.out.println(name + ": " + activities);
        };
        students.forEach(student-> b1.accept(student.getName(),student.getActivities()));
    }

    public static void main(String[] args) {

        //printName();
        printScoreFilter();
        printBiConsumer();

    }

}
