import java.util.*;
public class Gcd{
    public int FindGcd(int n1, int n2){
        int gcd = 1;
        for (int i = Math.min(n1,n2); i > 1; i++) {
            if (n1 % i == 0 && n2 % i == 0) gcd = i;
        }
        return gcd;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        Gcd gcd = new Gcd();
        int result = gcd.FindGcd(num1, num2);
        System.out.println(result);
    }
}