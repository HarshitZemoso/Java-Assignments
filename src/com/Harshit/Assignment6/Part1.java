package com.Harshit.Assignment6;

public class Part1 {
    Part1(String str) {
        System.out.println("Argument is " + str);
    }

    public static void main(String[] args) {
        Part1 a[] = new Part1[1];
        a[0] = new Part1("String");
    }
}
