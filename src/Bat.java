import java.util.Scanner;

public class Bat extends Animal {
    private Double pricePerDay;
    private String name;

    public Bat(Double pricePerDay, String name) {
        this.pricePerDay = pricePerDay;
        this.name = name;
    }

    public String toString() {
        return name + " " + "bat" + " " + pricePerDay;

    }

}

