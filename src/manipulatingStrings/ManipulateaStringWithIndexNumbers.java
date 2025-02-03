package manipulatingStrings;

public class ManipulateaStringWithIndexNumbers {
    public static void main(String[] args) {
        //indexOf(String stringToSearchFor)
        String testString = "This is a test which is nice";
        int indexOfSearch1= testString.indexOf("Java"); // returns -1
        int indexOfSearch2 = testString.indexOf("is"); // returns 2
        int indexOfSearch3 = testString.indexOf("est"); // returns 11

        System.out.println("testString.indexOf(\"Java\") : " + testString.indexOf("Java"));
        System.out.println("testString.indexOf(\"is\") : " + testString.indexOf("is"));
        System.out.println("testString.indexOf(\"est\") : " + testString.indexOf("est"));

        //substring(int startIndexPosition)
        String testString1 = "This is a paper";
        String result1 = testString1.substring(3);  //”s is a paper”
        String result2 = testString1.substring(12); // “st”


        System.out.println("testString1.substring(3) : " + testString1.substring(3));
        System.out.println("testString1.substring(12) : " + testString1.substring(12));

        //The trim method
        String testString2 = "  This is a test	";
        String result3 = testString2.trim(); // results in “This is a test”

        System.out.println("testString : #" + testString2 + "#");
        System.out.println("testString.trim() : #" +  testString2.trim() + "#");

    }
}
