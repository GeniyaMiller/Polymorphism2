package driver;

import transport.truck.Truck;

public class C extends Driver<Truck> {
    public C(String name, String license, int experience, Truck car) {
        super(name, license, experience, car);
    }
}
