public class PalidromeIterative {

    public static boolean palindromeTest(String palindrome) {
        palindrome = palindrome.replaceAll("[;,\s\t\n]+", "");
        palindrome = palindrome.toLowerCase();
        int beginning = 0;
        int end = palindrome.length() - 1;

        while (beginning < end) {
            if (palindrome.charAt(beginning) != palindrome.charAt(end)) {
                return false;
            }
            beginning++;
            end--;
        }

        return true;
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
