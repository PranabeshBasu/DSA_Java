import java.util.*;
public class LearnIterator{
    public static void main(String[] args) {
        List <Integer> l = new ArrayList<>();
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        Iterator <Integer> it = l.listIterator();
        while (it.hasNext()) {
            int num = it.next();
            System.out.println(num);
        }
    }
}