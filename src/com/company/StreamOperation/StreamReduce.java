package com.company.StreamOperation;

import com.company.data.Student;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamReduce {
    static Function<String, List<Student>> getStudentByGender=
            (s)->{
            return StreamMap.getStudents()
                    .filter((student -> student.getGender()==s)).collect(Collectors.toList());
            };
    public static Student GetMaxGPAStudent(){
        return getStudentByGender.apply("male").stream()
                .reduce((s1,s2)-> s1.getGpa()>s2.getGpa()? s1: s2).get();
    }

    public static void main(String[] args) {
        //getStudentByGender.apply("male").forEach(System.out::println);
        System.out.println(GetMaxGPAStudent());
    }
}
