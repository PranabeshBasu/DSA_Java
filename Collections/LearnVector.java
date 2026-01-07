import java.util.*;
public class LearnVector {
    public static void main(String[] args) {
        Vector <Integer> v = new Vector<>();
        v.add(2);
        v.add(3);
        v.add(2, 4);
        System.out.println(v.capacity());
        System.out.println(v.size());
        v.remove(1);
        System.out.println(v);
    }
}
