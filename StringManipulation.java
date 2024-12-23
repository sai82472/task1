"JAVA PROGRAMS BY ASHOK IT"

public class StringManipulation {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide a single string as the command-line argument.");
            return;
        }
        String inputString = args[0];
        int length = inputString.length();
        System.out.println("The length of the string: " + length);
        String upperCaseString = inputString.toUpperCase();
        System.out.println("The string in uppercase: " + upperCaseString);
        if (isPalindrome(inputString)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true; 
    }
}
