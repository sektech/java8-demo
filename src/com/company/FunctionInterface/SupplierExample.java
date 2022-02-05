package com.company.FunctionInterface;

import com.company.data.Student;
import com.company.data.StudentDatabase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {
        Supplier<Student> sup=()->{
            return new Student("Adam",2,3.6,"male", Arrays.asList("swiming","basketball","running"));
        };
        Supplier<List<Student>> sup1=()->{
            return StudentDatabase.getAllStudents();
        };
        System.out.println(sup.get());
        System.out.println(sup1.get());
    }
}
