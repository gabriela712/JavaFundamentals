package basics;

import java.awt.*;
import java.util.Date;

public class VariablesAndDataTypesExample {
    public static void main(String[] args) {

        // Primitive Data Types:
        byte age = 23; // -128 TO 127 8 bits
        short dias = 24; // -32768 to 32767 16 bits
        int years = 1930; // -2,147,483,648 to 2,147,483,647 32 bits
        long viewsCount = 1_112_345_678; // -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 64 bits 0L
        float price = 234.56F; // Approximately ±3.40282347E+38F (6-7 significant decimal digits)  32 bits 0.0f
        double pi = 3.14159; // Approximately ±1.79769313486231570E+308 (15 significant decimal digits) 64 bits 0.0d
        char gender = 'M'; // Any single keyboard character 16 bits
        boolean isValid = true; // true or false 1 bits default value: false

        System.out.println(age);
        System.out.println(dias);
        System.out.println(years);
        System.out.println(viewsCount);
        System.out.println(price);
        System.out.println(pi);
        System.out.println(gender);
        System.out.println(isValid);

        // Non-Primitive Data Types:
        String name = "Johana Perez"; // Uses memory as required
        System.out.println(name);
        Date now = new Date();
        System.out.println(now);

        Point point1 = new Point(10, 20);
        Point point2 = point1;
        System.out.println(point1.x + " : " + point1.y);
        System.out.println(point2.x + " : " + point2.y);

        point1.y = 25;
        System.out.println(point1.x + " : " + point1.y);
        System.out.println(point2.x + " : " + point2.y);

    }
}
