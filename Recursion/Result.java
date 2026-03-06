import java.util.*;
public class Result {
    public boolean PalindromeCheck(String s) {
        return checkPalindrome(s, 0, s.length() - 1);
    }
    private boolean checkPalindrome(String s, int left, int right) {
        if (left >= right) return true; //Base Case

        if (s.charAt(left) != s.charAt(right)) return false;
        return checkPalindrome(s, left + 1, right - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to check");
        String s = sc.nextLine();
        Result r = new Result();
        boolean isPalindrome = r.PalindromeCheck(s);
        System.out.println(isPalindrome);
    }
}