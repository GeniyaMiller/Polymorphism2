package driver;

import transport.Competing;
import transport.Transport;

public abstract class Driver <T extends Transport & Competing> {
    private String name;
    private String license;
    private int experience;

    private T car;

    public Driver(String name, String license, int experience, T car) {
        if (name == null || name.isEmpty() || name.isBlank()) {
            throw new NullPointerException("Укажите имя водителя");
        }
        this.name = name;
        if (license.equals("B") || license.equals("C") || license.equals("D")) {
            this.license = license;
        } else {
            System.out.println("Увас нет водительского удостоверения");
        }
        if (experience<0){
            this.experience = Math.abs(experience);
            return;
        }
        this.experience = experience;
        this.car = car;

    }

    public void startMove(){
        System.out.println("Начинает движение " + car.getBrand() + car.getBrand());
    }

    public void stopMove(){
        System.out.println("Заканчиват движение " + car.getBrand() + car.getBrand());
    }

    public void refill(){
        System.out.println("Направляется на заправку " + car.getBrand() + car.getBrand());
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public T getCar() {
        return car;
    }

    public void showInfoParticipate () {
        System.out.println("Водитель " + getName() + " управляет автомобилем " + car.getBrand() + car.getModel() + " и будет участвовать в заезде");
    }
    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", license='" + license + '\'' +
                ", experience=" + experience +
                ", car=" + car +
                '}';
    }
}
