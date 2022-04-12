package com.Harshit.Assignment7.Rodent;

class Mouse extends Rodent {


    Mouse() {
        animal = "Mouse";
        System.out.println("Constructer of mouse class Calling");
    }

    //overriden methods
    void running() {
        System.out.println("Mouse is running");
    }

    void eating() {
        System.out.println("Mouse is eating");
    }

    @Override
    void weight() {
        System.out.println(animal + " mouse is small in size");
    }

    @Override
    void color() {
        System.out.println(animal + " skin Color can vary");
    }





}