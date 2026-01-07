import java.util.*;

public class LearnArraylist {
    public static void main(String[] args) {
        ArrayList <Integer> al = new ArrayList<>();
        al.add(2);
        al.add(1, 3);
        al.add(4);
        System.out.println(al);
        System.out.println(al.get(0));
        al.remove(2);
        System.out.println(al.size());
        System.out.println(al.contains(2));
        al.clear();
        System.out.println(al);
    }
}
