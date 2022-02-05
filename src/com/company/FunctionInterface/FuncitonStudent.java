package com.company.FunctionInterface;

import com.company.data.Student;
import com.company.data.StudentDatabase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FuncitonStudent {

   static Function<List<Student>, Map<String,Double>> resultFunction= (students)->{
        Map<String,Double> studentMap = new HashMap<>();
        students.forEach((stu)->{
            studentMap.put(stu.getName(),stu.getGpa());
        });
        return studentMap;
    };

    public static void main(String[] args) {
        System.out.println(resultFunction.apply(StudentDatabase.getAllStudents()));
    }

}
