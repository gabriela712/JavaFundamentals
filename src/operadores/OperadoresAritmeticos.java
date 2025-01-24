package operadores;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int x = 15;
        int y = 4;

        int suma = x + y;
        int resta = x - y;
        int multiplicacion = x * y;
        int division = x / y;
        int modulo = x % y;

        System.out.println("Suma: " + suma);                  // 19
        System.out.println("Resta: " + resta);                // 11
        System.out.println("Multiplicación: " + multiplicacion); // 60
        System.out.println("División: " + division);          // 3
        System.out.println("Módulo: " + modulo);              // 3
    }
}

