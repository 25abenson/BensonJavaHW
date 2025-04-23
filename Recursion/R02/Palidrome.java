public class Palidrome {

    public static boolean palindromeTest(String palindrome) {
        palindrome = palindrome.replaceAll("[;,\s\t\n]+", "");
        palindrome = palindrome.toLowerCase();
        int beginning = 0;
        int end = palindrome.length() - 1;

        if (palindrome.length() <= 1) {
            return true;
        } else if (palindrome.charAt(beginning) == palindrome.charAt(end)) {
            return palindromeTest(palindrome.substring(1, (palindrome.length() - 1)));
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(palindromeTest("hello"));
        System.out.println(palindromeTest("kayak"));
        System.out.println(palindromeTest("abba"));
        System.out.println(palindromeTest("madam"));
        System.out.println(palindromeTest("short"));
        System.out.println(palindromeTest("toot"));
        System.out.println(palindromeTest("madaM, im Adam"));
    }
}