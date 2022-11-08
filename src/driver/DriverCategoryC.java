package driver;

import transport.truck.Truck;

public class DriverCategoryC extends Driver<Truck> {
    public DriverCategoryC(String name, String license, int experience, Truck car) {
        super(name, license, experience, car);
    }
}
