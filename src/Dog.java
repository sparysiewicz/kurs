public class Dog {
    private Double dogpriceperday;
    private String dogname;

    public Dog(Double dogpriceperday, String dogname) {
        this.dogpriceperday = dogpriceperday;
        this.dogname = dogname;
    }

    public String toString() {
        return dogname + " " + "dog";
    }

}
