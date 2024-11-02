import maquinaexpendedora.Maquina;
import java.util.ArrayList;
import nombre.Validadora;

public class App {
    public static void main(String[] args) throws Exception {
        Maquina maquina = new Maquina();
        Archivo archivo = new Archivo();
        ArrayList<String> lineas = archivo.leerArchivo("src/data/Monedas.txt");
        for (String linea : lineas) {
            maquina.validateMoney(linea);
        }
        Validadora validadora = new Validadora();
        validadora.validateName("DAX");
    }
}
