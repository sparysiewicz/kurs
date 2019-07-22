import org.omg.PortableInterceptor.ServerRequestInfo;

import java.io.*;
import java.lang.reflect.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;


public class Main {
    public static void main(String[] args) {

        List<Animal> animals = Files.loadAnimal("animals.txt");
        for (int i = 1; i < 1; i += 1) {
            Scanner s = new Scanner(System.in);
            System.out.println("please enter type of animal");
            String input = s.next();
            if (input.equals("cat")) {
                System.out.println("please write cat's name");
                String name = s.next();
                System.out.println("you wrote: " + name);
                System.out.println("please enter cat price per day");
                Double price = s.nextDouble();
                System.out.println("you enter: " + price);
                Cat myCat = new Cat(price, name);
                animals.add(myCat);
                Files.saveAnimal(myCat);
            } else if (input.equals("bat")) {
                System.out.println("please write bat's name");
                String name = s.next();
                System.out.println("you wrote: " + name);
                System.out.println("please enter bat price per day");
                Double price = s.nextDouble();
                System.out.println("you enter: " + price);
                Bat myBat = new Bat(price, name);
                animals.add(myBat);
                Files.saveAnimal(myBat);
            } else if (input.equals("dog")) {
                System.out.println("please write dog's name");
                String name = s.next();
                System.out.println("you wrote: " + name);
                System.out.println("please enter dog price per day");
                Double price = s.nextDouble();
                System.out.println("you enter: " + price);
                Dog myDog = new Dog(price, name);
                animals.add(myDog);
                Files.saveAnimal(myDog);
            } else {
                System.out.println("Sorry, we do not have places for this type of animals");


            }
        }
        for (int j = 1; j < 3; j += 1) {
            Scanner sc = new Scanner(System.in);
            System.out.println("animals");
            System.out.println(animals);
            System.out.println("please enter name of animal, that you want to remove");
            String nameOfAnimal = sc.next();
            List<Animal> animalFiltered = animals.stream()
                    .filter(animal -> animal.getName().equals(nameOfAnimal))
                    .collect(Collectors.toList());
            animals.removeAll(animalFiltered);
            Files.saveListOfAnimal(animals);



            System.out.println(animals);


        }


    }
}