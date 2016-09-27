
public class Recursion {
    public Recursion() {// default constructor
        // thro exception UnsupportedOperationException
    }

    int CAt6 = 5;

    public static int factorial(Integer num) {
        if (num == 1) {
            return 1;
        }

        return num * factorial(num - 1);
    }

    public static boolean isPalindrome(String string) {
        string = string.replaceAll("\\s", "");
        string = string.toUpperCase();
        // System.out.println(string);
        if (string.length() < 2) {
            return true;
        }

        else {
            char front = string.charAt(0);
            char end = string.charAt(string.length() - 1);
            return (front == end)
                    && isPalindrome(string.substring(1, string.length() - 1));

        }
        // return true;
    }

    public static boolean isIdentifier(String string) {
        // if (Character.isAlphabetic(string.charAt(0)))
       // int end = string.charAt(string.length() - 1);
        if (string.length() == 1 && Character.isLetter(string.charAt(0))) {
            return true;
        }
        else if (isAlphaNum(string.charAt(string.length() - 1)) && string.length()> 1) {

            return isIdentifier(string.substring(0, string.length() - 1));

        }

        return false;
    }

    private static boolean isAlphaNum(char c) {
        if (Character.isLetter(c) || Character.isDigit(c) || c == '_') {
            return true;
        }
        return false;
 
    }

    public static int factor(String string) {

        return 0;
    }

    public static void main(String args[]) {
        System.out.println(factorial(5));
        System.out.println(isPalindrome("taco Cat"));
        System.out.println(isIdentifier("cat6"));
        System.out.println(isIdentifier("cat 6"));

        System.out.println(isIdentifier("Cat_6"));

    }

}