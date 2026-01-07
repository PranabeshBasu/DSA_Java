import java.util.*;

public class LearnLinkedlist {
    public static void main(String[] args) {
        LinkedList <Integer> ll = new LinkedList<>();
        ll.add(23); // normal adding at the end
        ll.addFirst(34); //add at first
        ll.addLast(55); //add at last
        ll.add(3, 46); // adding at an index
        System.out.println(ll);
        System.out.println(ll.size());
        System.out.println(ll.contains(55));
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
    }
}
