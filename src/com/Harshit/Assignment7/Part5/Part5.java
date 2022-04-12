package com.Harshit.Assignment7.Part5;


import com.Harshit.Assignment7.Part5.OuterClassTwo;//second outer class having inner class inherites  inner class of first outer class

//driver class

public class Part5 {

    public static void main(String args[]) {
        OuterClassTwo o1 = new OuterClassTwo();
        OuterClassTwo.InnerClassTwo i1 = o1.new InnerClassTwo(1, 2);
        i1.getValues();
    }

}
