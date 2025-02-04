package manipulatingStrings;

public class Passwords {
    public static void main(String[] args) {
        //equals
        String password = "secRetOfM3*@";

        if(password.equals("secRetOfM3*@") ) {
            System.out.println("Hello");
        }

        //compareTo
        String password1 = "secRetfM3*@";

        if(password1.compareTo("secRetfM3*@") == 0 ) {
            System.out.println("Welcome");
        }

        //Determine if a String is empty( si la cadena esta vacia)
        String testString = "";

        if( testString.isEmpty() ) {
            System.out.println("The String is empty");
        }

        //Determine if a String contains a substring
        String fullName = "Tim Berners Lee";
        String familyName = "Lee";

        if( fullName.contains(familyName) ) {
            System.out.println("The family name " + familyName + " exists in the name " + fullName);
        }
    }
}
