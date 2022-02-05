package com.company.FunctionInterface;

import com.company.data.Student;
import com.company.data.StudentDatabase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionStudent {

   static BiFunction<List<Student>, Predicate<Student>, Map<String,Double>> functionBi =
            (students,predicateStudent)->{
            Map<String,Double> studentMap = new HashMap<>();
            students.forEach(student->
            {
               if( predicateStudent.test(student))
                   studentMap.put(student.getName(),student.getGpa());
            });
            return studentMap;
            };
    static Predicate<Student> p1 = (student)-> student.getGender()=="male";
    public static void main(String[] args) {
        System.out.println(functionBi.apply(StudentDatabase.getAllStudents(),p1));
    }
}
