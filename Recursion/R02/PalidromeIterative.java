public class PalidromeIterative {

    public static boolean palindrome2Test(String palindrome) {
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
        System.out.println(palindrome2Test("hello"));
        System.out.println(palindrome2Test("kayak"));
        System.out.println(palindrome2Test("abba"));
        System.out.println(palindrome2Test("madam"));
        System.out.println(palindrome2Test("short"));
        System.out.println(palindrome2Test("toot"));
        System.out.println(palindrome2Test("madaM, im Adam"));
    }
}
