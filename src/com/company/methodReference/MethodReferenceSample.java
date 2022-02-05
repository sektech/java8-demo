package com.company.methodReference;

import com.company.data.Student;
import com.company.data.StudentDatabase;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class MethodReferenceSample {
    static Consumer<Student> c1 = (student->System.out.println(student));
    static Consumer<Student> c2 = System.out::println;
    static Consumer<Student> c3 = Student::printActivities;

    public static void main(String[] args) {
        //StudentDatabase.getAllStudents().forEach(c1);
        StudentDatabase.getAllStudents().forEach(c2);
        StudentDatabase.getAllStudents().forEach(c3);
        System.out.println(StudentDatabase.getStudent.get());
    }
}
