package transport;

import driver.Driver;
import mechanic.Mechanic;
import sponsor.Sponsor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Transport {
    private String brand;
    private String model;
    private double volume;

    private List<Driver<?>> drivers = new ArrayList<>();

    private List<Sponsor> sponsors = new ArrayList<>();

    private List<Mechanic<?>> mechanics = new ArrayList<>();



    public Transport(String brand, String model, double volume) {
        if (brand == null || brand.isBlank() || brand.isEmpty()) {
            this.brand = "default";
            return;
        }
        this.brand = brand;

        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "default";
            return;
        }
        this.model = model;
        if (volume < 0){
            this.volume = Math.abs(volume);
            return;
        }
        this.volume = volume;

    }

    public void addDriver(Driver<?>... driver){
        this.drivers.addAll(Arrays.asList(driver));
    }
    public void addSponsor(Sponsor... sponsor){
        this.sponsors.addAll(Arrays.asList(sponsor));
    }
    public void addMechanic(Mechanic<?>... mechanic){
        this.mechanics.addAll(Arrays.asList(mechanic));
    }

    public abstract void start();

    public abstract void finish();

    public abstract boolean passDiagnostics();

    public abstract void fixCar();


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public List<Driver<?>> getDrivers() {
        return drivers;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }

    public List<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    @Override
    public String toString() {
        return "Transport " +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", volume=" + volume +
                ' ';
    }


}

