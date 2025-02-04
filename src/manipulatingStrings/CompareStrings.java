package manipulatingStrings;

public class CompareStrings {
    public static void main(String[] args) {
        //equalsIgnoreCase(String stringToCompare)
        String testString = "Java";

        boolean result1 = testString.equalsIgnoreCase("java"); //true
        boolean result2 = testString.equalsIgnoreCase("JAVA"); //true

        System.out.println("testString.equalsIgnoreCase(\"java\") : " + testString.equalsIgnoreCase("java"));
        System.out.println("testString.equalsIgnoreCase(\"JAVA\") : " +  testString.equalsIgnoreCase("JAVA"));

        //compareTo(String stringToCompare) or compareToIgnoreCase(String stringToCompare)
        // non-zero is not equal and zero means equal
        int result3 = testString.compareTo ("java"); // returns -32
        int result4 = testString.compareTo("JAVA"); // returns 32

        int result5 = testString.compareToIgnoreCase("java"); // returns 0
        int result6 = testString.compareToIgnoreCase("JAVA"); // returns 0


        System.out.println("------- Comparing with respect to case ----------");
        System.out.println("testString.compareTo (\"java\") : " + testString.compareTo ("java"));
        System.out.println("testString.compareTo(\"JAVA\") : " +  testString.compareTo("JAVA"));

        System.out.println("------- Comparing irrespective of case ----------");
        System.out.println("testString.compareToIgnoreCase(\"java\") : " + testString.compareToIgnoreCase("java"));
        System.out.println("testString.compareToIgnoreCase(\"JAVA\") : " +  testString.compareToIgnoreCase("JAVA"));

    }

}
