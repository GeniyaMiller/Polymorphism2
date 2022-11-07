package driver;

import transport.Transport;
import transport.car.Car;

public class B extends Driver<Car> {

    public B(String name, String license, int experience, Car car) {
        super(name, license, experience, car);
    }

}