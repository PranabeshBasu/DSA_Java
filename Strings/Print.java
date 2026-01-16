import java.util.Arrays;

public class Print {
    public static void main(String[] args) {
        System.out.println(10);
        System.out.println("Pranabesh");
        // System.out.println(new int[]{1, 2, 3, 4, 5}); // [I@4517d9a3
        //to override it we have to override the existing class
        System.out.println(Arrays.toString(new int[]{1, 2, 3, 4, 5}));
    }
}
