package com.Harshit.Assignment3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mean {
    static final Scanner sc = new Scanner(System.in);
    static float calculateMean(String host) throws IOException {

        int ping_message= sc.nextInt();
        String pingMessage_in_string = String.valueOf(ping_message);
        String line;

        //array to store totaltime taken to ping each totaltime
        float[] totaltime = new float[ping_message];

        //ProcessBuilder Class is used to Create New Process and we are calling this function recursively
        ProcessBuilder process = new ProcessBuilder("ping", "-c", pingMessage_in_string, host);
        Process run_process = process.start();

        BufferedReader output = new BufferedReader(new InputStreamReader(run_process.getInputStream()));

        //forming the RegEx to find totaltime from outputline
        Pattern pattern = Pattern.compile("time=([0-9]+[.]?[0-9]*)");

        int i =0;
        while ((line = output.readLine()) != null) {
            Matcher matcher = pattern.matcher(line);
            if (matcher.find()) {

                String pingTime = matcher.group(1);
                float time = Float.parseFloat(pingTime);

                totaltime[i++] = time;
            }
        }

        //sort the array
        Arrays.sort(totaltime);
        int len = totaltime.length;

        int index = (int) len / 2;
        if (len % 2 == 0) {
            return (totaltime[index] + totaltime[index - 1]) / 2;

        } else {
            return totaltime[index];
        }
    }
    // Main Method
    public static void main(String args[]) throws IOException {

        String host = sc.next();
        System.out.println(calculateMean(host)+ " ms");


    }
}
