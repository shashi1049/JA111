
public class PalindromeChecker1 {
	public static boolean isPalindromeWithOneRemoval(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                // If characters at left and right do not match, try removing one of them
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }

            left++;
            right--;
        }

        return true;
    }

    private static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "racecar";
        boolean result = isPalindromeWithOneRemoval(str);
        if (result) {
            System.out.println(str + " is a palindrome or can be turned into one by removing at most one character.");
        } else {
            System.out.println(str + " is not a palindrome and cannot be turned into one by removing at most one character.");
        }
    }
}

