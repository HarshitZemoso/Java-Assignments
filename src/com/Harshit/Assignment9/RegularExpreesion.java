package com.Harshit.Assignment9;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpreesion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        //regex if sentence starts with small letter
        Pattern smallCase = Pattern.compile("^[a-z]");

        Matcher m = smallCase.matcher(s);
//regex if sentence starts with capital letter and ends with fullstop

        Pattern regex = Pattern.compile("^[A-Z].*[.]$");

        Matcher matcher = regex.matcher(s);
        if (matcher.matches()) {
            System.out.println("Valid sentence");
        } else if (m.find()) {
            System.out.println("String should start with  a Capital letter");
        } else {
            System.out.println("Sentence should end with .");
        }
    }
}
