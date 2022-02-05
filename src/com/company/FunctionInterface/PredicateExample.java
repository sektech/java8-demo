package com.company.FunctionInterface;

import com.company.data.Student;
import com.company.data.StudentDatabase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

    static Predicate<Student> pStud = (student)-> student.getGender()=="male";
    static Predicate<Student> pStud1 = (student) -> student.getGradeLevel() > 3;
    public static void main(String[] args) {

        java.util.function.Predicate<Integer> p1 = (a)->a%2==0;
        Predicate<Integer> p2 = (a)->a%5==0;
        System.out.println(p1.and(p2).test(20   ));


        List<Student> students = StudentDatabase.getAllStudents();
        students.forEach(student->{
            if(pStud.and(pStud1).test(student))
                System.out.println(student);
        });


    }
}
