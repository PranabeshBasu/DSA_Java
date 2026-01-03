import java.util.Scanner;

public class PrimeCheck {
    public boolean isPrime(int n){
        if(n <= 1) return false;
        // for(int i=2; i<n; i++){
        //     if(n % i == 0) return false;
        // } This is brute force method with TC of O(n)

        for(int i=2; i*i <= n; i++){
            if(n % i == 0) return false;
        } // This is the optimized method with TC of O(sqrt(n))
        return true;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        PrimeCheck pc = new PrimeCheck();
        boolean result = pc.isPrime(num);
        System.out.println(result);
    }
}
