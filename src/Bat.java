public class Bat {
    private Double batpriceperday;
    private String batname;

    public Bat(Double batpriceperday, String batname) {
        this.batpriceperday = batpriceperday;
        this.batname = batname;
    }

    public String toString() {
        return batname + " " + "bat";
    }

}

