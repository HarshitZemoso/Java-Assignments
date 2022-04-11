package com.Harshit.Assignment1;

import java.util.Scanner;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchDirectory {
    /**
     * This method search files recursively in directory and its sub-directories
     */
    static void searchFiles(String pattern, String directory) {

        //Get to the directoryName
        File dir = new File(directory);
        final Pattern regex;

        // Catch block if a regex pattern is not valid
        try {
            regex = Pattern.compile(pattern);
        } catch (Exception e) {
            System.out.println("Please Enter Valid Java Regex");
            return;
        }

        //list all files in the directory
        File[] files = dir.listFiles();


        assert files != null;
        for (File file : files) {
            if (file.isFile()) {

                Matcher matcher = regex.matcher(file.getName());

                if (matcher.find()) {
                    System.out.println(file.getAbsolutePath());
                }
            }

            //Search in the subdirectory
            else if (file.isDirectory())
                searchFiles(pattern, file.getAbsolutePath());
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Regex you want to match");
        String pattern = in.next();
        //Run untill user enters -1
        while (!pattern.equals("-1")) {
            searchFiles(pattern, "/home/user/");
            System.out.println("Enter Next Regex or -1 to quit");
            pattern = in.next();
        }
    }
}
