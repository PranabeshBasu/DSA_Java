import java.util.Scanner;

public class PrimeRange{
    public boolean isPrime(int n){
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++){
            if (n % i == 0) return false;
        }
        return true;
    }
    public int PrimeCount(int n){
        int count = 0;
        for (int j = 2; j <= n; j++){
            if(isPrime(j)) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        PrimeRange pc = new PrimeRange();
        int count = pc.PrimeCount(num);
        System.out.println(count);
    }
}