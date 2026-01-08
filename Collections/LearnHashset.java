import java.util.*;
public class LearnHashset{
    public static void main(String[] args) {
        HashSet <Integer> hs = new HashSet<>();
        hs.add(2);
        hs.add(4);
        hs.add(5);
        hs.add(6);
        System.out.println(hs);
        System.out.println(hs.size());
        System.out.println(hs.contains(5));
        hs.remove(4);
        for(var num:hs){
            System.out.println(num);
        }
        hs.add(2); //Does not store unique element
        System.out.println(hs);
    }
}