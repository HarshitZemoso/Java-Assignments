package com.Harshit.Assignment8;



/*

  Create three new types of exceptions. Write a class with a method that throws all three.
  In main( ), call the method but only use a single catch clause that will catch all three types of exceptions.
  Add a finally clause and verify that your finally clause is executed, even if a NullPointerException is thrown.

 */


//three new user defined exception
class ExceptionOne extends Exception {

    ExceptionOne() {

    }

}

class ExceptionTwo extends Exception {



    ExceptionTwo() {

    }

}

class ExceptionThree extends Exception {


    ExceptionThree() {

    }

}

//class having a method throwing all three types of exception

public class ErrorHandling {
    void method1(String st) throws ExceptionOne, ExceptionTwo, ExceptionThree {

        if (st.equalsIgnoreCase("exception one is thrown")) {
            throw new ExceptionOne();
        } else if (st.equalsIgnoreCase("exception two")) {
            throw new ExceptionTwo();
        } else if (st.equalsIgnoreCase("exception three")) {
            throw new ExceptionThree();
        }


    }


//main method handling all three types of exception by one catch block and excecuted finally block

    public static void main(String[] args) {

        ErrorHandling e = new ErrorHandling();
        try {
            e.method1("Exception one");
        } catch (Exception exception) {
            System.out.println("Handling every Exception");
        } finally {
            System.out.println("finallyBlock");
        }
    }

}
