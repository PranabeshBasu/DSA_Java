import java.util.*;
public class ValidAnagramBrute {
    public boolean CheckAnagram(String s, String t) {
        if (s.length() != t.length()) return false; //lengths should be same
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        Arrays.sort(sChar);
        Arrays.sort(tChar);
        return Arrays.equals(sChar,tChar);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the main string: ");
        String str1 = sc.nextLine();
        System.out.println("Enter the string for comparison: ");
        String str2 = sc.nextLine();
        ValidAnagramBrute anagram = new ValidAnagramBrute();
        boolean check = anagram.CheckAnagram(str1, str2);
        if (check) System.out.println("The 2nd string is a VALID ANAGRAM of the 1st one");
        else System.out.println("Not a VALID ANAGRAM");
    }
}
