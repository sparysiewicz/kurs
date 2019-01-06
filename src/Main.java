

public class Main {
    public static void main (String [] args) {
        Cat myCat = new Cat();
        Dog myDog = new Dog();
        Bat myBat = new Bat(3.52);
        Integer catHello = myCat.sayYourNumber();
        String dogHello = myDog.sayHi();
        String batAsString = myBat.toString();
        System.out.println(catHello);
        System.out.println(dogHello);
        System.out.println(batAsString);

    }
    }