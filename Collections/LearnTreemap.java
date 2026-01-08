import java.util.*;
public class LearnTreemap {
    public static void main(String[] args) {
        TreeMap <Integer,String> person = new TreeMap<>();
        person.put(56, "Pranabesh");
        person.put(45, "Pausali");
        person.put(65, "Pritam");
        person.put(67, "Rajbir");
        System.out.println(person);
        System.out.println(person.get(65));
        System.out.println(person.remove(65));
        System.out.println(person);
        System.out.println(person.floorKey(50));
        System.out.println(person.ceilingKey(50));
    }
}
