package com.company;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

    static Predicate<Student> pStud = (student)-> student.getGender()=="male";
    static Predicate<Student> pStud1 = (student) -> student.getGradeLevel() > 3;
    static Consumer<Student> con1 = (student)->{
        if(pStud.and(pStud1).test(student))
            System.out.println(student);
    };
    public static void main(String[] args) {


        List<Student> students = StudentDatabase.getAllStudents();
        students.forEach(con1);


    }
}
