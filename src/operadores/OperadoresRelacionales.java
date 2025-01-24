package operadores;

public class OperadoresRelacionales {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        System.out.println("x > y: " + (x > y));    // true
        System.out.println("x < y: " + (x < y));    // false
        System.out.println("x >= y: " + (x >= y));  // true
        System.out.println("x <= y: " + (x <= y));  // false
        System.out.println("x == y: " + (x == y));  // false
        System.out.println("x != y: " + (x != y));  // true
    }
}
