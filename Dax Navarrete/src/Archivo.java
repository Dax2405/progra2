import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class Archivo {
    
    public ArrayList<String> leerArchivo(String nombreArchivo) {
        ArrayList<String> lineas = new ArrayList<>();
        try {
            File file = Paths.get(nombreArchivo).toFile();
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                lineas.add(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se enconro el archivo(tal vez en Windowzzz no se obtiene bien el path(linux superior)): " + e.getMessage());
        }
        return lineas;
    }
    
}
