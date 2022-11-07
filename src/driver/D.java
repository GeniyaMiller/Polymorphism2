package driver;

import transport.bus.Bus;

public class D extends Driver<Bus>{
    public D(String name, String license, int experience, Bus car) {
        super(name, license, experience, car);
    }
}
