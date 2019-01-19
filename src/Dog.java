public class Dog {
    private Double dogprice;
    private String dogname;

    public Dog(Double dogprice, String dogname) {
        this.dogprice = dogprice;
        this.dogname = dogname;
    }

    public String toString() {
        return dogname + " " + "dog";
    }

}
