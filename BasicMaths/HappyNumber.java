import java.util.*;

public class HappyNumber {
    public boolean isHappy(int n) {
        while (n != 1 && n != 4) {
            int sum = 0;
            while (n > 0) {
                int l = n % 10;
                sum += l * l;
                n = n / 10;
            }
            n = sum;
        }
        return n == 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check: ");
        int n = sc.nextInt();
        HappyNumber h = new HappyNumber();
        System.out.println(h.isHappy(n));
    }
}