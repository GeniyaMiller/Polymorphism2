package mechanic;

import transport.Transport;

public class Mechanic<T extends Transport> {
    private String name;
    private String surname;
    private String company;


    public Mechanic(String name, String surname, String company) {
        this.name = name;
        this.surname = surname;
        this.company = company;
    }

    public boolean passDiagnostics(T t){
        return t.passDiagnostics();
    }

    public void fixCar(T t){
        t.fixCar();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Механики " + name + " " + surname + '\'' + ", из " + company;
    }
}
