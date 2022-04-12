package com.Harshit.Assignment7.Rodent;

class Hamster extends Rodent {
    Hamster() {
        animal = "Hamester";
        System.out.println(animal + " class  Constructer Calling");
    }

    //overriden methods
    void running() {
        System.out.println("Hamester is running");
    }

    void eating() {
        System.out.println("Hamester is eating");
    }

    //implementation of abstract methods
    void weight() {
        System.out.println(animal + " tailSize is large");
    }


    void color() {
        System.out.println(animal + " skin Color is light red");
    }

}