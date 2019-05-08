import javax.print.*;
import java.io.*;

public class Files {
    public static void saveAnimal(Animal animal) {
        String animalAsString = animal.toString();
        File f = new File("animals.txt");
        try {
            f.createNewFile();
            FileWriter writer = new FileWriter(f);
            writer.append(animalAsString);
            writer.append("\n");
            writer.close();


        } catch (IOException e) {
            System.out.println("plik już istnieje");
        }
    }


}


