package com.company.StreamOperation;

import com.company.data.Student;
import com.company.data.StudentDatabase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class StreamAPIExample {
    static Predicate<Student> p1 = (student -> student.getGender()=="male");
    static Predicate<Student> p2 = (student -> student.getGradeLevel() >3);
    public static void main(String[] args) {

        //filter male students and create map of name : activities
        Map<String, List<String>> collect = StudentDatabase.getAllStudents().stream()
             //   .peek((student ->System.out.println(student))) //for debugging
                .filter(p1)
                //.peek((student ->System.out.println(student))) //for debugging
                .filter(p2)
                .peek((student ->System.out.println(student))) //for debugging
                .collect(Collectors.toMap(Student::getName, Student::getActivities));
        //System.out.println(collect        );
       collect.values().forEach(System.out::println);

    }
}
