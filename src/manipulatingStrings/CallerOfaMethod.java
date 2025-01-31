package manipulatingStrings;

public class CallerOfaMethod {
    public static void main(String[] args) {

        String welcomeToJavaString = "Welcome java";
        // “welcomeToJavaStringInUpperCase” will be “WELCOME JAVA”
        String welcomeToJavaStringInUpperCase = welcomeToJavaString.toUpperCase();

        System.out.println("The string  " + welcomeToJavaString  + " in upper case is : " + welcomeToJavaStringInUpperCase );

        //Aqui de forma directa

        String welcomeUseDirectString = "Welcome java".toUpperCase();

        System.out.println("The string Welcome java in upper case is : " + welcomeUseDirectString);
    }

}
