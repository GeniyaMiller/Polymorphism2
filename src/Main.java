import driver.DriverCategoryB;
import driver.DriverCategoryC;
import driver.DriverCategoryD;
import transport.bus.Bus;
import transport.car.Car;
import transport.truck.Truck;

public class Main {
    public static void main(String[] args) {
        System.out.println("CAR");
        Car audi = new Car("Audi", "A8", 3.0, null);
        Car lada = new Car("Lada", "Grande", 1.7, Car.BodyType.Minivan);
        Car bmw = new Car("BMW", "Z8", 3.0, Car.BodyType.Coupe);
        System.out.println(audi.toString());



        System.out.println("TRUCK");
        Truck toyota = new Truck("Toyota", "F45", 3.0, null);
        Truck mers = new Truck("Mercedes", "W32", 2.5, Truck.LoadCapacity.N3);
        Truck chevrolet = new Truck("Chevrolet", "M5", 2.7, Truck.LoadCapacity.N2);
        System.out.println(toyota.toString());



        System.out.println("BUS");
        Bus mercedes = new Bus("Mercedes", "M45", 2.9, null);
        Bus wv = new Bus("WV", "AM21", 3.2, Bus.Capacity.large);
        Bus opel = new Bus("Opel", "S8", 2.9, Bus.Capacity.particularlySmall);
        System.out.println(mercedes.toString());




        DriverCategoryB ivan = new DriverCategoryB("Ivan", "B", 7, lada);
        DriverCategoryC bob = new DriverCategoryC("Bob", "C", 14, toyota);
        DriverCategoryD maxim = new DriverCategoryD("Maxim", "D", 3, wv);

        ivan.showInfoParticipate();
        bob.showInfoParticipate();
        maxim.showInfoParticipate();

    }
}