import org.omg.Messaging.*;

import javax.print.*;
import java.io.*;
import java.util.*;

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
                System.out.println(animalData);
            }

        } catch (IOException e) {
            System.out.println("nie znaleziono pliku");
        }
        return animals;
    }

}


