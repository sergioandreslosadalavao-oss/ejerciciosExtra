package ejercicios;

public class unnamedVariables {
    public static void main(String[] args) {
        int[] valores = { 2, 0, 4 };

        for (int divisor : valores) {
            try {
                System.out.println("10 / " + divisor + " = " + (10 / divisor));
            } catch (ArithmeticException _) {
                System.out.println("No se puede dividir entre " + divisor + ".");
            }
        }
    }
}
