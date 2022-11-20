package serviceStation;

import transport.Transport;
import transport.car.Car;
import transport.truck.Truck;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation {

    private Queue<Transport> queue = new LinkedList<>();

    public ServiceStation() {
    }

    public void addAuto(Transport transport){
         queue.offer(transport);
    }


    public void diagnostics(){
        Transport transport = queue.poll();
        if(transport != null){
            boolean result = transport.passDiagnostics();
            if(!result){
                transport.fixCar();
            }

        }
    }
}
