package com.company.FunctionInterface;

import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Before java 8 - code
        Runnable runn = new Runnable() {
            @Override
            public void run() {
                System.out.println("This is from imperative code");
            }
        };
        Thread t = new Thread(runn);
        t.start();
        //Java 8 code
        new Thread(() -> System.out.println("This is from java 8 code")).start();

        Comparator<Integer> comp = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
               return o2.compareTo(o1);
            }
        };
        System.out.println(comp.compare(15,14));
        Comparator<Integer> comp1 = (a,b) -> a.compareTo(b);
        System.out.println(comp1.compare(15,14));

    }


}
