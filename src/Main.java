import org.omg.PortableInterceptor.ServerRequestInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Bat> bats = new ArrayList<>();
        for (int i = 1; i < 4; i += 1) {
            Scanner s = new Scanner(System.in);
            System.out.println("please write bat's name");
            String name = s.next();
            System.out.println("you wrote: " + name);
            System.out.println("please enter bat price per day");
            Double price = s.nextDouble();
            System.out.println("you enter: " + price);
            Bat myBat = new Bat(price, name);
            bats.add(myBat);
        }
        System.out.println(bats);
    }
}