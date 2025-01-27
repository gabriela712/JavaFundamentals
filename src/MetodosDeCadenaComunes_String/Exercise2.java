package MetodosDeCadenaComunes_String;

public class Exercise2 {
    public static void main(String[] args) {
        String title = "Java programming is fun and educational";

        // Declare and initialize the searchWord
        String searchWord = "fun";

        // Check if the searchWord is present in title
        boolean containsWord = title.contains("fun");
        System.out.println("Does the title contain the word \"" + searchWord + "\"? " + containsWord);

        //length of the string
        int titleLength = title.length();
        System.out.println("Length of the string title: " + titleLength);

        //Declare and initialise the length of shortened title
        int maxLength = 17;


        // Shortened the title
        String shortBookTitle = title.substring(0, maxLength);
        System.out.println("Original title: " + title);
        System.out.println("Shortened title: " + shortBookTitle);

        // Replace the word "educational" with "awesome"
        String newTitle = title.replace("educational", "awesome");
        System.out.println("New title: " + newTitle);
    }
}
