import java.lang.reflect.Array;
import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String s = "Pranabesh Basu";
        System.out.println(s.length());
        System.out.println(s.charAt(5));
        System.out.println(s.substring(0, 7));
        System.out.println(Arrays.toString(s.split(" ")));
        System.out.println("    I Love Coding".strip());
    }
}
