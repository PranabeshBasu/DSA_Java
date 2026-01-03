import java.util.Scanner;

public class PerfectNo {
    public boolean isPerfectNo(int n){
        int sum = 1;
        for (int i = 2; i*i <= n; i++){
            if (n % i == 0){
                sum += i;
                if (n != (n/i)) sum += (n/i);
            }
        }
        return sum == n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        PerfectNo p = new PerfectNo();
        boolean isPerfect = p.isPerfectNo(num);
        System.out.println(isPerfect);
    }
}
