package com.Harshit.Assignment5;

public class Singleton {
    String string;

    static Singleton getter(String string) {
        Singleton obj = new Singleton();
        obj.string = string;
        return obj;
    }

    public void getString() {
        System.out.println(string);
    }
}
