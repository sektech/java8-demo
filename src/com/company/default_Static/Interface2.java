package com.company.default_Static;

public interface Interface2{

    default void methodA(){
        System.out.println("This is from methodB " + getClass().getName()  );
    }
}
