public class Bat {
    private Double batprice;
    private String batname;

    public Bat(Double batprice, String batname) {
        this.batprice = batprice;
        this.batname = batname;
    }

    public String toString() {
        return batname + " " + "bat";
    }

}

