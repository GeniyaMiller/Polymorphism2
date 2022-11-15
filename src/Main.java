import driver.DriverCategoryB;
import driver.DriverCategoryC;
import driver.DriverCategoryD;
import transport.Transport;
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
        audi.passDiagnostics();



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

        passDiagnostics(audi, lada, bmw,
                        toyota, mers, chevrolet,
                        mercedes, wv, opel);

        DriverCategoryB ivan = new DriverCategoryB("Ivan", "null", 7, lada);
        DriverCategoryC bob = new DriverCategoryC("Bob", "C", 14, toyota);
        DriverCategoryD maxim = new DriverCategoryD("Maxim", "D", 3, wv);

        ivan.showInfoParticipate();
        bob.showInfoParticipate();
        maxim.showInfoParticipate();

    }

    public static void passDiagnostics(Transport... transports){
        for (Transport transport : transports) {
            diagnosticsTransport(transport);
        }

    }

    public static void diagnosticsTransport(Transport transport){
        try {
            if(!transport.passDiagnostics()){
                throw  new RuntimeException(transport.getClass() + " " + transport.getBrand() + " " + transport.getModel() + " не прошел диагностику");
            }
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
}