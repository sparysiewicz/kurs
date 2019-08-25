import org.omg.Messaging.*;

import javax.print.*;
import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Files {
    public static void saveAnimal(Animal animal) {
        String animalAsString = animal.toString();
        File f = new File("animals.txt");
        try {
            f.createNewFile();
            FileWriter writer = new FileWriter(f, true);
            writer.append(animalAsString);
            writer.append("\n");
            writer.close();


        } catch (IOException e) {
            System.out.println("plik już istnieje");
        }
    }

    public static List<Animal> loadAnimal(String fileName) {
        List<Animal> animals = new ArrayList<>();
        File f = new File(fileName);
        try {
            FileReader reader = new FileReader(f);
            BufferedReader buffered = new BufferedReader(reader);
            String animalData;
            while ((animalData = buffered.readLine()) != null) {
                String[] animalList = animalData.split(" ");
                String nameofAnimal = animalList[0];
                String typeofAnimal = animalList[1];
                Double priceofAnimal = Double.parseDouble(animalList[2]);

                if (typeofAnimal.equals("cat")) {
                    animals.add(new Cat(priceofAnimal, nameofAnimal));
                } else if (typeofAnimal.equals("dog")) {
                    animals.add(new Dog(priceofAnimal, nameofAnimal));
                } else if (typeofAnimal.equals("bat")) {
                    animals.add(new Bat(priceofAnimal, nameofAnimal));
                } else {
                    System.err.println("nieznany typ zwierzęcia " + typeofAnimal);
                }

            }

        } catch (IOException e) {
            System.out.println("nie znaleziono pliku");
        }
        return animals;


    }

    public static List<Animal> removeAnimalFromFile(List<Animal> animals, String nameOfAnimal) {

        StringBuilder sb = new StringBuilder();

        List<Animal> updatedList = animals.stream()
                .filter(animal -> !animal.getName().equals(nameOfAnimal))
                .collect(Collectors.toList());
        updatedList.stream()
                .map(Object::toString)
                .forEach(animal -> {

                    sb.append(animal);
                    sb.append("\n");

                });

        String animalAsString = sb.toString();
        File f = new File("animals.txt");
        try {
            f.createNewFile();
            FileWriter writer = new FileWriter(f, false);
            writer.append(animalAsString);
            writer.close();


        } catch (IOException e) {
            System.out.println("plik już istnieje");
        }
        return updatedList;
    }


}