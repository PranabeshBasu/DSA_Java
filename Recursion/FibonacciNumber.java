import java.util.*;
public class FibonacciNumber {
    public int fib(int num) {
        //Base case 
        if (num <= 1) return num; //As Fib(0) = 0 and Fib(1) = 1
        return fib(num - 1) + fib(num - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no: ");
        int n = sc.nextInt();
        FibonacciNumber fib = new FibonacciNumber();
        System.out.println(fib.fib(n));
    }
}
