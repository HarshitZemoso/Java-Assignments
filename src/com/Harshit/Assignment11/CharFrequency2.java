package com.Harshit.Assignment11;

import java.io.*;
import java.util.*;

public class CharFrequency2 {
    public static void main(String[] args){

        HashMap<Character,Integer> map = new HashMap<>();
        Scanner input;

        try {

            input =new Scanner(new File("input.txt"));
            PrintWriter printWriter =  new PrintWriter("output1.txt");
            while(input.hasNext()){
                for(char c:input.nextLine().toCharArray()){
                    if(map.containsKey(c)){
                        map.put(c,map.get(c)+1);
                    }
                    else{
                        map.put(c,1);
                    }
                }
            }
            printWriter.println("Character        Count");
            for(Character c:map.keySet()){
                printWriter.println(c+"                "+map.get(c));
            }


            input.close();
            printWriter.close();
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
        }



    }
}