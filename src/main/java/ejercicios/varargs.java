package ejercicios;

public class varargs {
    static int sumar(int... numeros) {
        int total = 0;
        for (int n : numeros) {
            total += n;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println("Suma de 1,2,3 = " + sumar(1, 2, 3));
        System.out.println("Suma de 5,10 = " + sumar(5, 10));
        System.out.println("Suma sin argumentos = " + sumar());
    }
}
