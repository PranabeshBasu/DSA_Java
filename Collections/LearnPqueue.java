import java.util.*;
public class LearnPqueue {
    public static void main(String[] args) {
        PriorityQueue <Integer> pq = new PriorityQueue<>();
        pq.offer(9);
        pq.offer(10);
        pq.offer(20);
        pq.offer(2);
        System.out.println(pq);
        while(pq.isEmpty() == false){
            System.out.println(pq.peek());
            pq.poll();
        }
        //poll, size also there
    }
}
