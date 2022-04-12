package com.Harshit.Assignment7.Rodent;

class Gerbil extends Rodent {

    Gerbil() {
        animal = "Gerbil";
        System.out.println(animal  + " class  Constructer Calling");
    }

    //overriden methods
    void running() {
        System.out.println("Gerbil is running");
    }


    void eating() {
        System.out.println("Gerbil is eating");
    }


    //implementation of abstract methods

    void weight() {
        System.out.println(animal + " weight is very high");
    }


    void color() {
        System.out.println(animal + " skin Color is black");

    }

}
