public class Dog extends Animal {
    private Double pricePerDay;
    private String name;

    public Dog(Double pricePerDay, String name) {
        this.pricePerDay = pricePerDay;
        this.name = name;
    }

    public String toString() {
        return name + " " + "dog" + " " + pricePerDay;
    }

    @Override
    public String getName() {
        return name;
    }

}
