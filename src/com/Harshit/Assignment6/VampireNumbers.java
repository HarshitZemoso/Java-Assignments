package com.Harshit.Assignment6;

/*
 A vampire number v is a number with an even number of digits n,that can be factored into two numbers x and y each with n/2 digits and not both with trailing zeroes, where v contains precisely all the digits from x and from y, in any order. Write a java program to print first 100 vampire numbers.
 */


public class VampireNumbers {



    static String swap(String s, int i, int j) {

        char[] arr = s.toCharArray();
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        s = String.valueOf(arr);
        return s;
    }
    static int v;
    static boolean checkVampire(String s) {

        String FIRST = s.substring(0, s.length() / 2);
        String SECOND = s.substring(s.length() / 2);
        return (Integer.parseInt(FIRST) * Integer.parseInt(SECOND)) == v;
    }


    //forming all the permutations of that number

    static boolean permutationAndCheckVampire(String s, int start, int end) {

        if (start == end) {
            return checkVampire(s);
        }
        for (int i = start; i <= end; i++) {

            s = swap(s, start, i);

            if (permutationAndCheckVampire(s, start + 1, end))
                return true;
            s = swap(s, start, i);

        }
        return false;
    }

    static boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;

        }
        return true;
    }
    static boolean isVampire(String s) {
        return permutationAndCheckVampire(s, 0, s.length() - 1);

    }


    public static void main(String[] args) {
        int cnt = 1;
        //as Vampire no are even digit composite no so start checking from 10
        v = 10;

        while (cnt <= 100) {

            String s = String.valueOf(v);
            if (s.length() % 2 == 1) {

                v = v * 10;
            }
            else if (!isPrime(v) && isVampire(s)) {
                System.out.println(v);
                cnt++;
            }
            v++;

        }


    }


}
