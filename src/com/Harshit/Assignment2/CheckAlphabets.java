package com.Harshit.Assignment2;


import java.util.Scanner;

public class CheckAlphabets {
    public static boolean checkAll(String s){

        int[] alphabets = new int[26];
        for (int i = 0; i < s.length() ; i++) {
            alphabets[s.charAt(i)-'a']++;
    }
        for (int i = 0; i < 26; i++) {
        if (alphabets[i]==0)
            return false;
    }
        return true;
}
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String s = sc.next();
        boolean ans = checkAll(s.toLowerCase());
        if (ans)
            System.out.println("String contains all the alphabets");
        else
            System.out.println("String Does Not Contain all the alphabets!");
    }


}
