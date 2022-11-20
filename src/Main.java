import driver.DriverCategoryB;
import driver.DriverCategoryC;
import driver.DriverCategoryD;
import mechanic.Mechanic;
import serviceStation.ServiceStation;
import sponsor.Sponsor;
import transport.Transport;
import transport.bus.Bus;
import transport.car.Car;
import transport.truck.Truck;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Sponsor tinkoff = new Sponsor("Тинькофф", 250000);
        Sponsor redBull = new Sponsor("Red Bull", 400000);
        Mechanic<Transport> shmelev = new Mechanic<>("Семен", "Шмелев", "Infinity");
        Mechanic<Truck> popov = new Mechanic<>("Артем", "Попов", "Buz");

        Car audi = new Car("Audi", "A8", 3.0, null);
        Car lada = new Car("Lada", "Grande", 1.7, Car.BodyType.Minivan);
        Car bmw = new Car("BMW", "Z8", 3.0, Car.BodyType.Coupe);


        Truck toyota = new Truck("Toyota", "F45", 3.0, Truck.LoadCapacity.N2);
        Truck mers = new Truck("Mercedes", "W32", 2.5, Truck.LoadCapacity.N3);
        Truck chevrolet = new Truck("Chevrolet", "M5", 2.7, Truck.LoadCapacity.N2);


        Bus mercedes = new Bus("Mercedes", "M45", 2.9, null);
        Bus wv = new Bus("WV", "AM21", 3.2, Bus.Capacity.large);
        Bus opel = new Bus("Opel", "S8", 2.9, Bus.Capacity.particularlySmall);



        passDiagnostics(audi, lada, bmw,
                        toyota, mers, chevrolet,
                        mercedes, wv, opel);

        DriverCategoryB ivan = new DriverCategoryB("Ivan", "B", 7, lada);
        DriverCategoryC bob = new DriverCategoryC("Bob", "C", 14, toyota);
        DriverCategoryD maxim = new DriverCategoryD("Maxim", "D", 3, wv);

        lada.addDriver(ivan);
        lada.addMechanic(shmelev);
        lada.addSponsor(tinkoff);

        toyota.addDriver(bob);
        toyota.addMechanic(popov,shmelev);
        toyota.addSponsor(tinkoff, redBull);

        wv.addDriver(maxim);
        wv.addMechanic(shmelev);
        wv.addSponsor(redBull);

        List<Transport> transports = List.of(
                lada, toyota, wv);
        for(Transport transport:transports){
            getInfo(transport);
        }

        ServiceStation ss = new ServiceStation();
        ss.addAuto(lada);
        ss.addAuto(toyota);
        ss.diagnostics();
        ss.diagnostics();


    }

    private static void getInfo(Transport transport){
        System.out.println("Информация по автомобилю: " + transport.getBrand() + " " + transport.getModel());
        System.out.println(transport.getDrivers());
        System.out.println(transport.getMechanics());
        System.out.println(transport.getSponsors());
    }

    private static void passDiagnostics(Transport... transports){
        for (Transport transport : transports) {
            diagnosticsTransport(transport);
        }

    }

    private static void diagnosticsTransport(Transport transport){
        try {
            if(!transport.passDiagnostics()){
                throw  new RuntimeException(transport.getClass() + " " + transport.getBrand() + " " + transport.getModel() + " не прошел диагностику");
            }
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
}