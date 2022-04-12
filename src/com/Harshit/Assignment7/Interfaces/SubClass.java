package com.Harshit.Assignment7.Interfaces;

class SubClass extends Base implements NewInterface {
    public void methodOne() {
        System.out.println("method One");
    }

    public void methodTwo() {
        System.out.println("method two");
    }

    public void methodThree() {
        System.out.println("method three");
    }

    public void methodFour() {
        System.out.println("method Four");
    }

    public void methodFive() {
        System.out.println("method five");
    }

    public void methodSix() {
        System.out.println("method six");
    }

    public void methodSeven() {
        System.out.println("method seven");
    }

    //method having interface one as an argument

    void one(I1 i1) {
        i1.methodOne();
        i1.methodTwo();
    }

    ////method having interface two as an argument
    void two(I2 i2) {

        i2.methodThree();
        i2.methodFour();
    }

    ////method having interface three as an argument
    void three(I3 i3) {
        i3.methodFive();
        i3.methodSix();
    }

    ////method having interface NewInterface as an argument
    void four(NewInterface i4) {
        i4.methodSeven();


    }
}
