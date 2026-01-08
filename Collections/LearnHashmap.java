import java.util.*;
public class LearnHashmap {
    public static void main(String[] args) {
        HashMap <Integer,String> data = new HashMap<>();
        data.put(1, "Pranabesh Basu");
        data.put(12, "Rajbir Dey");
        data.put(2, "Pritam Karak");
        System.out.println(data);
        System.out.println(data.get(12));
        data.remove(12);
        System.out.println(data);
        System.out.println(data.size());
    }
}
