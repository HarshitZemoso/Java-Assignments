package com.Harshit.Assignment6;
public class Part2 {
    int a, b;

    Part2(int one, int two) {
        this(one);
        b = two;
    }

    Part2(int one) {
        a = one;
    }

    void getNumbers() {
        System.out.println("one :" + a + " two: " + b);

    }

    public static void main(String[] args) {

        Part2 obj = new Part2(10, 20);
        obj.getNumbers();
    }

}