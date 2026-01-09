import java.util.*;
public class MaxHeap {
    public static Comparator<Integer> getComparator(){
        return new Comparator<Integer>() {
            public int compare(Integer num1, Integer num2) { 
                if (num1 < num2) {
                    return 1;
                }
                else if (num1 > num2) {
                    return -1;
                }
                else {
                    return 0;
                }
            }
        };
    }
    public static void main(String[] args) {
        //Max Heap Implementation
        PriorityQueue<Integer> max = new PriorityQueue<>(getComparator());
        max.add(1);
        max.add(2);
        max.add(3);
        max.add(4);
        max.add(9);
        System.out.println(max.peek());
    }
}
