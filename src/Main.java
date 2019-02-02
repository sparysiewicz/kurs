import org.omg.PortableInterceptor.ServerRequestInfo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("please write bat's name");
        String name = s.next();
        System.out.println("you wrote: " + name);
        System.out.println("please enter bat price per day");
        Double price = s.nextDouble();
        System.out.println("you enter: " + price);
        Bat myBat = new Bat(price, name);
        System.out.println(myBat);

    }
}