package com.Harshit.Assignment7.CycleInterface;

//factory class producing unicycle,bicycle,tricycle
class CycleFactory {
    InterfaceCycle getCycle(String cycleType) {
        if (cycleType != null) {
            if (cycleType.equalsIgnoreCase("UNICYCLE")) {
                return new UnicycleClass();
            } else if (cycleType.equalsIgnoreCase("BICYCLE")) {
                return new BicycleClass();
            } else if (cycleType.equalsIgnoreCase("TRICYCLE")) {
                return new TricycleClass();
            }
        }
        return null;


    }
}
