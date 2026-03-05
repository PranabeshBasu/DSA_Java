import java.util.*;

public class ReverseStringRecursion {
    private void reverse(ArrayList<Character> s, int left, int right) {
        //Base case
        if (left >= right) return;

        char ch = s.get(left);
        s.set(left, s.get(right));
        s.set(right, ch);

        //Recursive call
        reverse(s, left + 1, right - 1);
    }
    public ArrayList<Character> reverseString(ArrayList<Character> s) {
        int left = 0;
        int right = s.size() - 1;
        reverse(s, left, right);
        return s;
    }
    public static void main(String[] args) {
        ArrayList<Character> str = new ArrayList<>(java.util.Arrays.asList('h','e','l','l','o'));
        ReverseStringRecursion rev_str = new ReverseStringRecursion();
        System.out.println(rev_str.reverseString(str));
    }
}
