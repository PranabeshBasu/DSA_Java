import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class StringReversalStack {
    public void reverse(List<Character> s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s) {
            stack.push(c);
        }
        for (int i = 0; i < s.size(); i++) {
            s.set(i, stack.pop());
        }
    }
    public static void main(String[] args) {
        List<Character> l = new ArrayList<>(Arrays.asList('h','e','l','l','o'));
        StringReversalStack s = new StringReversalStack();
        s.reverse(l);
        for (char c : l) {
            System.out.print(c);
        }
    }
}
