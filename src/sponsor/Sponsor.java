package sponsor;

public class Sponsor {
    private String name;

    private int amount;

    public Sponsor(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public void sponsorTheRace(){
        System.out.println("Спонсор " + getName() +  " проспонсировал заезд на " + getAmount());
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Спонсоры:" +  name + " " + ", сумма" + amount;
    }
}
