import driver.B;
import driver.C;
import driver.D;
import transport.bus.Bus;
import transport.car.Car;
import transport.truck.Truck;

public class Main {
    public static void main(String[] args) {
        System.out.println("CAR");
        Car audi = new Car("Audi", "A8", 3.0);
        Car lada = new Car("Lada", "Grande", 1.7);
        Car bmw = new Car("BMW", "Z8", 3.0);
        System.out.println(audi.toString());
        System.out.println(lada.toString());
        System.out.println(bmw.toString());
        audi.doMaxSpeed();
        audi.doPitStop();
        audi.getBestTime();
        lada.doMaxSpeed();
        lada.doPitStop();
        lada.getBestTime();
        bmw.doMaxSpeed();
        bmw.doPitStop();
        bmw.getBestTime();


        System.out.println("TRUCK");
        Truck toyota = new Truck("Toyota", "F45", 3.0);
        Truck mers = new Truck("Mercedes", "W32", 2.5);
        Truck chevrolet = new Truck("Chevrolet", "M5", 2.7);
        System.out.println(toyota.toString());
        System.out.println(mers.toString());
        System.out.println(chevrolet.toString());
        toyota.doMaxSpeed();
        toyota.doPitStop();
        toyota.getBestTime();
        mers.doMaxSpeed();
        mers.doPitStop();
        mers.getBestTime();
        chevrolet.doMaxSpeed();
        chevrolet.doPitStop();
        chevrolet.getBestTime();

        System.out.println("BUS");
        Bus mercedes = new Bus("Mercedes", "M45", 2.9);
        Bus wv = new Bus("WV", "AM21", 3.2);
        Bus opel = new Bus("Opel", "S8", 2.9);
        System.out.println(mercedes.toString());
        System.out.println(wv.toString());
        System.out.println(opel.toString());
        mercedes.doMaxSpeed();
        mercedes.doPitStop();
        mercedes.getBestTime();
        wv.doMaxSpeed();
        wv.doPitStop();
        wv.getBestTime();
        opel.doMaxSpeed();
        opel.doPitStop();
        opel.getBestTime();


        B ivan = new B("Ivan", "B", 7, lada);
        C bob = new C("Bob", "C", 14, toyota);
        D maxim = new D("Maxim", "D", 3, wv);

        ivan.showInfoParticipate();
        bob.showInfoParticipate();
        maxim.showInfoParticipate();

    }
}