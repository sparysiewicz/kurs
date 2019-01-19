import org.omg.PortableInterceptor.ServerRequestInfo;

public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat(50.00, "rysio");
        Dog myDog = new Dog(70.00, "zyzio");
        Bat myBat = new Bat(100.00, "dyzio");
        String dogAsString = myDog.toString();
        String batAsString = myBat.toString();
        String catAsString = myCat.toString();
        System.out.println(catAsString);
        System.out.println(dogAsString);
        System.out.println(batAsString);

    }
}