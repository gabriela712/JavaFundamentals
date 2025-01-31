package manipulatingStrings;

public class IdentifyaString {
    public static void main(String[] args) {
        //startsWith(String prefix)
        String testString = "This is a test";

        boolean result1 = testString.startsWith("test"); // false
        boolean result2 = testString.startsWith("This"); // true

        System.out.println("testString.startsWith(\"test\") : " + testString.startsWith("test"));
        System.out.println("testString.startsWith(\"This\") : " + testString.startsWith("This"));

        //endsWith(String suffix)
        String test1String = "This is a test";

        boolean result3 = test1String.endsWith("test"); // true
        boolean result4 = test1String.endsWith("This"); // false

        System.out.println("testString.endsWith(\"test\") : " + test1String.endsWith("test"));
        System.out.println("testString.endsWith(\"This\") : " + test1String.endsWith("This"));

    }
}
