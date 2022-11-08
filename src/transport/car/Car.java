package transport.car;

import transport.Competing;
import transport.Transport;

public class Car extends Transport implements Competing {
    public Car(String brand, String model, double volume) {
        super(brand, model, volume);
    }

    public enum BodyType {Sedan,
            Hatchback,
            Coupe,
            StationWagon,
            SUV,
            Crossover,
            PickupTruck,
            Van,
            Minivan}

    @Override
    public void start() {
        System.out.println("Нажать на педаль сцепления, завести двигатель, включить первую передачу, снять с ручного тормоза, нажать педаль газа, отпустить сцепление.");

    }

    @Override
    public void finish() {
        System.out.println("Выжимаем педаль тормоза и педаль сцепления до полной остановки, включаем нейтральную передачу, ставим на ручной тормоз, отпускаем педалиб выключаем двигатель.");
    }


    @Override
    public void doPitStop() {
        System.out.println("Заправка автомобиля " + getBrand() + " топливом, смена шин, быстрый ремонт и проверка технического состояния машины");
    }

    @Override
    public void getBestTime() {
        System.out.println("Лучшее время круга у автомобиля " + getBrand() + " - ");

    }

    @Override
    public void doMaxSpeed() {
        System.out.println("Максимальная скорость у автомобиля " + getBrand() + " - ");
    }
}
