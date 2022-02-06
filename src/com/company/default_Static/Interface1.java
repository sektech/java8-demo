package com.company.default_Static;

public interface Interface1 {
    default void methodA(){
        System.out.println("This is from methodA  " + getClass().getName() );
    }
}
