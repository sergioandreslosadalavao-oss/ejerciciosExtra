package ejercicios;
import java.util.Scanner;
public class multiCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String entrada;

        System.out.println("Escribe un número para dividir 10 entre él (o 'salir' para terminar):");

        while (true) {
            System.out.print("> ");
            entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("salir")) {
                System.out.println("Programa terminado.");
                break;
            }

            try {
                int numero = Integer.parseInt(entrada);
                double resultado = 10.0 / numero;
                System.out.println("10 / " + entrada + " = " + resultado);
            } catch (NumberFormatException | ArithmeticException e) {
                System.out.println("Error: dato inválido o división por cero.");
            }
        }

    }
}