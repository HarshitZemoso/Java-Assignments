package com.Harshit.Assignment11;

import java.io.*;
import java.util.*;

public class CharFrequency {

    static HashMap<Character,Integer> map = new HashMap<>();
    public static void main(String[] args){


        Scanner input;

        try {

            input =new Scanner(new File("input.txt"));
            while(input.hasNext()){
                // for-each style for loop
                for(char c:input.nextLine().toCharArray()){
                    if(map.containsKey(c)){
                        map.put(c,map.get(c)+1);
                    }
                    else{
                        map.put(c,1);
                    }
                }
            }
            input.close();
        }
        catch (FileNotFoundException e){
            System.out.println("File not found1");
        }
        PrintWriter printWriter;
        try {
            printWriter =  new PrintWriter("output.txt");
            printWriter.println("Character        Count");
            for(Character c:map.keySet()){
                printWriter.println(c+"  "+map.get(c));
            }
            printWriter.close();
        }
        catch (FileNotFoundException e){
            System.out.println("File not found ");
        }


    }
}