package transport.truck;

import transport.Competing;
import transport.Transport;

public class Truck extends Transport implements Competing {
    public Truck(String brand, String model, double volume) {
        super(brand, model, volume);
    }

    public enum LoadCapacity {N1, N2, N3 }
    //N1 с полной массой до 3,5 тонн
    //N2 с полной массой свыше 3,5 до 12 тонн
    //N3 с полной массой свыше 12 тонн


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
        System.out.println("Заправка грузовика " + getBrand() + " топливом, смена шин, быстрый ремонт и проверка технического состояния машины");
    }

    @Override
    public void getBestTime() {
        System.out.println("Лучшее время круга у грузовика " + getBrand() + " - ");

    }

    @Override
    public void doMaxSpeed() {
        System.out.println("Максимальная скорость у грузовика " + getBrand() + " - ");
    }
}
