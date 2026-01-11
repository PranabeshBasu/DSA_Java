import java.util.*;

public class Reversal{
    public void Result(List<Character> s) {
        int start = 0;
        int end = s.size() - 1;
        while (start < end) {
            char ch = s.get(start);
            s.set(start, s.get(end));
            s.set(end, ch);
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        List<Character> list = new ArrayList<>(Arrays.asList('h', 'e', 'l', 'l', 'o'));
        Reversal r = new Reversal();
        r.Result(list);
        for(char ch:list) {
            System.out.print(ch);
        }
    }
}