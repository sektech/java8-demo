package com.company.default_Static;

import com.company.data.Student;
import com.company.data.StudentDatabase;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import static com.company.data.StudentDatabase.*;

public class DefaultClass {

  static   Consumer<Student> c1 = (s)->System.out.println(s);
  static Comparator<Student> nameComp = Comparator.comparing(Student::getName);
    static Comparator<Student> gradeComp = Comparator.comparing(Student::getGradeLevel);
  static List<Student> sortByName(){
      List<Student> students = getAllStudents();
      students.sort(Comparator.comparing(Student::getName));

           return students;
  }
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Adam","Steve","bob","Alvven");
        //before java 8
        //Collections.sort(strings);
        strings.sort(Comparator.naturalOrder());
        List<Student> students = getAllStudents();
     //   students.sort(Comparator.comparingDouble(s->s.getGpa()));
      //  students.stream().map(Student::getName).forEach(System.out::println);
        //students.forEach(c1);
        //comparartor chaining
        students.sort(nameComp.thenComparing(gradeComp));
        sortByName().forEach(c1);
    }
}
