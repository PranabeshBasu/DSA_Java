import java.util.*;
public class Algo {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(5);
        l.add(9);
        l.add(4);
        System.out.println(l);
        Collections.sort(l);
        System.out.println(l);
        System.out.println(Collections.max(l));
        System.out.println(Collections.min(l));
        System.out.println(Collections.frequency(l, 4));
        Collections.reverse(l);
        System.out.println(l);
    }
}
