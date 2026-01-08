import java.util.*;
public class LearnTreeset {
    public static void main(String[] args) {
        //It is similar to hashset but stores the elements in sorted order
        TreeSet <Integer> ts = new TreeSet<>();
        ts.add(2);
        ts.add(5);
        ts.add(6);
        ts.add(3);
        System.out.println(ts);
        ts.remove(3);
        ts.add(9);
        System.out.println(ts);
        System.out.println(ts.floor(7)); 
        System.out.println(ts.ceiling(7));
    }
}
