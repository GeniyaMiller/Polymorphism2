package driver;

import transport.car.Car;

public class DriverCategoryB extends Driver<Car> {

    public DriverCategoryB(String name, String license, int experience, Car car) {
        super(name, license, experience, car);
    }

}