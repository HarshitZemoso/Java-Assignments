package com.Harshit.Assignment7.Part5;

class OuterClassOne {
    int outerVar;

    //inner class with non default constructor

    class InnerClassOne {
        int innerVar;

        //non default constructor

        InnerClassOne(int innerVarVal, int outerVarValue) {
            //accessing instance variables of outer class

            innerVar = innerVarVal;
            outerVar = outerVarValue;
            System.out.println("inside Inner Class One constructer");
        }

        public void getValues() {
            System.out.println("outerVar " + outerVar + " innerVar " + innerVar);
        }

    }

}
