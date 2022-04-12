package com.Harshit.Assignment7.CycleInterface;

public class Main {
    public static void main(String[] args) {
        InterfaceCycle cycle;

        //use getCycle method to get object of mentioned cycle type

        CycleFactory factory = new CycleFactory();


        cycle = factory.getCycle("unicycle");

        //calling balance method of unicycleClass
        cycle.balance();
        cycle = factory.getCycle("bicycle");

        //calling balance method of biicycleClass

        cycle.balance();
        cycle = factory.getCycle("tricycle");

        //calling balance method of tricycleClass
        cycle.balance();

    }
}
