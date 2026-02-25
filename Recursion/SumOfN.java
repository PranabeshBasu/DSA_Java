import java.util.*;
public class SumOfN {
    public int result(int n) {
        if (n == 0) return 0;
        return n + result(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        SumOfN s = new SumOfN();
        int sum = s.result(range);
        System.out.println(sum);
    }
}
