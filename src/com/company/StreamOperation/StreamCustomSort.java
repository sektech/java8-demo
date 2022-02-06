package com.company.StreamOperation;

import com.company.data.Student;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCustomSort {
    static List<Student> getStudentByName(){
        return StreamMap.getStudents()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        getStudentByName().forEach(System.out::println);
        System.out.println("Reverse student list");
        getStudentByName().stream().sorted(Comparator.comparing(Student::getName).reversed()).forEach(System.out::println);
    }
}
