import java.util.*;
public class CustomComparator {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(2);
        l.add(1);
        l.add(4);
        l.add(3);
        l.add(5);
        l.add(6);
        System.out.println(l);
        Collections.sort(l); //This will sort the list in ascending order
        System.out.println(l);
        //For sorting the list into descending order we have to write our own custom comparator
        Collections.sort(l, new Comparator<Integer>() {
            //[num1, num2]
            @Override
            public int compare(Integer num1, Integer num2) {
                if (num1 < num2) { //wrong order as we are sorting in descending order
                    return 1; //return positive integer to reverse the order
                }
                else if (num1 > num2) { //correct order
                    return -1; //negative integer not to change the order
                }
                else {
                    return 0;
                }
            }
        });
        System.out.println(l);
    }
}
