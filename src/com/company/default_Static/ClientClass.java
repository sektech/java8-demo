package com.company.default_Static;

public class ClientClass implements Interface1,Interface2 {
    public static void main(String[] args) {
        Interface2 cl = new ClientClass();
        cl.methodA();
    }

    @Override
    public void methodA() {
        Interface2.super.methodA();
    }
}
