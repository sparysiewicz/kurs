public class Cat extends Animal {

    private Double pricePerDay;
    private String name;

    public Cat(Double pricePerDay, String name) {
        this.pricePerDay = pricePerDay;
        this.name = name;
    }

    public String toString() {
        return name + " " + "cat" + " " + pricePerDay;
    }

    @Override
    public String getName() {
        return name;
    }
}



