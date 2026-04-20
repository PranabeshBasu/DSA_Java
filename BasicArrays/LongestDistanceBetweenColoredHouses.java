import java.util.*;
public class LongestDistanceBetweenColoredHouses {
    public int distance(int[] colors) {
        int diff = 0;
        //Fixing the left pointer to 0 and comparing it starting from the rightmost element
        //Also decrementing the right pointer
        for (int i = colors.length - 1; i >= 0; i--) {
            if (colors[i] != colors[0]) {
                diff = Math.max(diff, i);
            }
        }
        //Also checking from left to right and comparing it with the fixed rightmost element
        //Also incrementing the left pointer
        for (int i = 0; i < colors.length; i++) {
            if (colors[i] != colors[colors.length - 1]) {
                diff = Math.max(diff, colors.length - 1 - i);
            }
        }
        return diff;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of Houses: ");
        int n = sc.nextInt();
        int[] colors = new int[n];
        //Array Elements different colored houses
        // [1, 1, 1, 6, 1, 1, 1] 1 --> Red color, 6 --> Blue color
        for (int i = 0; i < n; i++) {
            colors[i] = sc.nextInt();
        }
        LongestDistanceBetweenColoredHouses d = new LongestDistanceBetweenColoredHouses();
        int longest_distance = d.distance(colors);
        System.out.println("Distance is: "+longest_distance);
    }
} 