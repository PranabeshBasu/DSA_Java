import java.util.Scanner;

public class ValidAnagramOptimized{
    public boolean check (String s, String t){
        if (s.length() != t.length()) return false;
        int[] count = new int[26];
        for (char c : s.toCharArray()) count[c - 'a']++;
        for (char c : t.toCharArray()) count[c - 'a']--;
        for (int i : count) {
            if (i != 0) return false; 
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the main string: ");
        String str1 = sc.nextLine();
        System.out.println("Enter the string for comparison: ");
        String str2 = sc.nextLine();
        ValidAnagramOptimized anagram = new ValidAnagramOptimized();
        boolean check = anagram.check(str1, str2);
        if (check) System.out.println("The 2nd string is a VALID ANAGRAM of the 1st one");
        else System.out.println("Not a VALID ANAGRAM");
    }
}