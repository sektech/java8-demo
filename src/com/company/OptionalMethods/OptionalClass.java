package com.company.OptionalMethods;

import com.company.data.Student;
import com.company.data.StudentDatabase;

import java.util.Optional;
import java.util.function.Supplier;

public class OptionalClass {

    static Optional<String> getStudentName (){
        Optional<Student> getStudent =Optional.ofNullable(StudentDatabase.getStudent.get());  // Optional.ofNullable(null);
        return getStudent.isPresent()? getStudent.map(Student::getName) : Optional.empty();
    }



    public static void main(String[] args) {
        System.out.println(getStudentName().isPresent()?getStudentName().get():"Not found");
    }
}
