package com.Harshit.Assignment7.Rodent;

public class Main {
    public static void main(String args[]) {

        //array of Rodent, refer to different specific types of Rodents
        Rodent rodents[] = new Rodent[3];

        rodents[0] = new Mouse();
        rodents[1] = new Gerbil();
        rodents[2] = new Hamster();

//calling  base-class methods
        for (int i = 0; i < 3; i++) {
            ;
            rodents[i].eating();
            rodents[i].weight();
            rodents[i].color();
            ;


        }

    }


}
