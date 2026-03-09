import java.util.*;
import java.util.Scanner;
public class PrimeCheck {
    public boolean Result(int num) {
        if (num <= 1) return false;
        return check(num, 2);
    }
    private boolean check(int num, int i) {
        if (i * i > num) {
            return true;
        }
        if (num % i == 0) {
            return false;
        }
        return check(num, i + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no to check");
        int n = sc.nextInt();
        PrimeCheck r = new PrimeCheck();
        System.out.println(r.Result(n));
    }
}