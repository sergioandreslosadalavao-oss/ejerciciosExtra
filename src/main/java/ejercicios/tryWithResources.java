package ejercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class tryWithResources {
    public static void main(String[] args) {
        System.out.println("Directorio de trabajo: " + System.getProperty("user.dir"));
        // Leerlo
        try (BufferedReader br = new BufferedReader(new FileReader("nombre.txt"))) {
            System.out.println("Contenido leído: " + br.readLine());
        } catch (IOException e) {
            System.out.println("No se pudo leer el archivo: " + e.getMessage());
        }
    }
}
