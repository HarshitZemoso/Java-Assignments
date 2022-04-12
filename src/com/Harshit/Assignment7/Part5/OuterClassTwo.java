package com.Harshit.Assignment7.Part5;

class OuterClassTwo {

    //inner class inherites  inner class of first outer class
    class InnerClassTwo extends OuterClassOne.InnerClassOne {
        InnerClassTwo(int a, int b) {
            //non static inner class constructor calling

            new OuterClassOne().super(a, b);
            System.out.println("inside Inner Class Two constructer");
        }
    }


}
