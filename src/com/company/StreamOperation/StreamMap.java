package com.company.StreamOperation;

import com.company.data.Student;
import com.company.data.StudentDatabase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMap {

    static Stream<Student> getStudents(){
        return StudentDatabase.getAllStudents().stream();
    }

    static List<String> getActivities(){
        List<String> collect = getStudents()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .collect(Collectors.toList());
        return  collect;
    }

    public static void main(String[] args) {
        //return student names as list
        List<String> studentList = getStudents()
                .map(Student::getName)
                .collect(Collectors.toList());
        Set<String> studentSet = getStudents()
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toSet());


        //studentList.forEach(System.out::print);
        //studentSet.forEach(System.out::println);
       // getActivities().forEach(System.out::println);
        //get distinct
        getActivities().stream().distinct().sorted().forEach(System.out::println);
    }
}
