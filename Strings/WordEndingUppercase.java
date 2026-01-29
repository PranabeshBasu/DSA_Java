import java.util.*;
public class WordEndingUppercase {
    public int count(String s) {
        int count = 0;
        int i = 0;
        while (i < s.length()) {
            if (Character.isUpperCase(s.charAt(i))) {
                if (i == s.length() - 1 || s.charAt(i + 1) == ' ') {
                    count += 1;
                }
            }
            i++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.nextLine();
        WordEndingUppercase w = new WordEndingUppercase();
        int c = w.count(s);
        System.out.println("The no of words ending with an uppercase letter is: "+c);
    }
}