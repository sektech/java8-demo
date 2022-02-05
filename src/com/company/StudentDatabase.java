package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentDatabase {

    public static List<Student> getAllStudents(){
        Student st1 = new Student("Adam",2,3.6,"male", Arrays.asList("swiming","basketball","running"));
        Student st2 = new Student("Tom",2,3.8,"male", Arrays.asList("swiming","scorrer","running"));

        Student st3 = new Student("Steve",3,4.0,"female", Arrays.asList("swiming","basketball","running"));
        Student st4 = new Student("Alex",3,3.9,"male", Arrays.asList("swiming","scorrer","running"));

        Student st5 = new Student("Sam",4,4.0,"male", Arrays.asList("swiming","basketball","running"));
        Student st6 = new Student("Nivan",4,3.9,"female", Arrays.asList("swiming","scorrer","running"));

        return new ArrayList<>(Arrays.asList(st1,st2,st3,st4,st5,st6));
    }

}
