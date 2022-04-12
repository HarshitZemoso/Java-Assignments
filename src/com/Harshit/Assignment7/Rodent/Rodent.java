package com.Harshit.Assignment7.Rodent;

public abstract class Rodent {
    String animal;

    Rodent() {
        animal = "Rodent";
        System.out.println("Constructer of Rodent Class Calling");
    }

    void eating() {
        System.out.println("Rodent is eating");
    }

    // different implementation in different child classes
    abstract void weight();

    abstract void color();


}
