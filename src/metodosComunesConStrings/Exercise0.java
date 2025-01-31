package MetodosDeCadenaComunes_String;

public class Exercise0 {
    public static void main(String[] args) {
        // Declarar e inicializar las variables
        String firstName = "Harry";
        String lastName = "Grow";
        String email = "harry.grow@example.com";

        // Convertir a minúsculas y concatenar firstName y lastName
        String username = firstName.toLowerCase() + lastName.toLowerCase();
        System.out.println("Username: " + username);

        // Corregir la dirección de correo electrónico
        email = email.replace("example.com", "gmail.com");
        System.out.println("Corrected email: " + email);

        // Encontrar el índice de '@'
        int atIndex = email.indexOf('@');
        System.out.println("Index of '@': " + atIndex);


    }
}
