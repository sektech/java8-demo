package com.company.StreamOperation;

import com.company.data.Student;
import com.company.data.StudentDatabase;

import java.util.function.Predicate;

public class StreamMapReduceFilter {
    static Predicate<Student> p1 = (student -> student.getGradeLevel()>2);

    public static void main(String[] args) {
        Integer noteBookCount = StudentDatabase.getAllStudents().stream()
                .filter(p1)
                .map(Student::getNotebooks)

                .reduce(0,(s1, s2) -> s1 + s2);

        System.out.println(noteBookCount);
    }
}
