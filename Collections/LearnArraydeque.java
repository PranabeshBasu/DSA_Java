import java.util.*;
public class LearnArraydeque {
    public static void main(String[] args) {
        ArrayDeque <Integer> adq = new ArrayDeque<>();
        adq.offer(3);
        adq.offer(4);
        adq.offer(5);
        adq.offer(6);
        System.out.println(adq);
        System.out.println(adq.peek());
        adq.poll();
        System.out.println(adq.peek());
        adq.offerFirst(7); //pollFirst also there
        adq.offerLast(9); //pollLast also there
        System.out.println(adq);
    }
}
